package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class InventorsAdapter(context: Context, inventors: ArrayList<InventorModel>):
        ArrayAdapter<InventorModel>(context,0,inventors){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inventorPosition = getItem(position)

        var view = convertView?: LayoutInflater.from(context).
        inflate(R.layout.display_inventor,parent, false)

        val name = view.findViewById<TextView>(R.id.inventor_name)
        val profile = view.findViewById<TextView>(R.id.inventor_description)
        val picture = view.findViewById<ImageView>(R.id.inventor_image)

        name?.text = inventorPosition?.name
        profile?.text = inventorPosition?.biography
        inventorPosition?.image.let {
            picture.setImageResource(inventorPosition!!.image)
        }
        return view
    }
}