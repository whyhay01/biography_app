package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class VisionaryAdapter(context: Context, visionaries : List<VisionaryModel>):
        ArrayAdapter<VisionaryModel>(context, 0, visionaries) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val visionaryPosition = getItem(position)

       val view = convertView ?: LayoutInflater.from(parent.context).
        inflate(R.layout.display_visionary,parent,false)

        val name = view.findViewById<TextView>(R.id.visionary_name)
        val profile = view.findViewById<TextView>(R.id.visionary_description)
        val image = view.findViewById<ImageView>(R.id.visionary_image)

        name?.text = visionaryPosition?.name
        profile?.text = visionaryPosition?.biography
        visionaryPosition?.image.let {
            image?.setImageResource(visionaryPosition?.image!!)

        }


        return view!!
    }
}