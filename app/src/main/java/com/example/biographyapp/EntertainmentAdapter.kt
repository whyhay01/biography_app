package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class EntertainmentAdapter(context: Context, entertainers: ArrayList<EntertainmentModel>):
        ArrayAdapter<EntertainmentModel>(context,0, entertainers) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val entertainerPosition = getItem(position)

        var view = convertView ?: LayoutInflater.from(parent.context
        ).inflate(R.layout.display_entertainment, parent,false)

        val name = view.findViewById<TextView>(R.id.entertainment_name)
        val profile = view.findViewById<TextView>(R.id.entertainment_description)
        val displayPicture = view.findViewById<ImageView>(R.id.entertainment_image)

        //setting the values for the display values
        name.text = entertainerPosition?.name
        profile.text = entertainerPosition?.biography
        entertainerPosition?.image.let {
            displayPicture.setImageResource(entertainerPosition!!.image)
        }

        return view

    }
}