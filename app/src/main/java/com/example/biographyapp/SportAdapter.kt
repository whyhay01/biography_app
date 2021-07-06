package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SportAdapter(context: Context,sportCategory: List<SportModel>) :
    ArrayAdapter<SportModel>(context,0,sportCategory) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        var sportItem = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.display_sport,parent,false)
        }

        val profilePicture = view?.findViewById<ImageView>(R.id.sport_image)
        val name = view?.findViewById<TextView>(R.id.sport_name)
        val detail = view?.findViewById<TextView>(R.id.sport_description)

        sportItem?.picture?.let {
            profilePicture?.setImageResource(sportItem.picture)
        }

        name?.text = sportItem?.name
        detail?.text = sportItem?.biography

        return view!!
    }
}