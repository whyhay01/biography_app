package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class WomenLeaderAdapter(context: Context, womenLeaders:ArrayList<WomenLeaderModel>):
        ArrayAdapter<WomenLeaderModel>(context,0,womenLeaders) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val womanLeaderPosition = getItem(position)
        var view = convertView ?: LayoutInflater.from(context).
        inflate(R.layout.display_women_leader,parent,false)

        val name = view.findViewById<TextView>(R.id.woman_leader_name)
        val profile = view.findViewById<TextView>(R.id.woman_leader_description)
        val picture = view.findViewById<ImageView>(R.id.woman_leader_image)

        name.text = womanLeaderPosition?.name
        profile.text = womanLeaderPosition?.biography

        womanLeaderPosition?.image.let {
            picture.setImageResource(womanLeaderPosition!!.image)
        }

        return view
    }
}