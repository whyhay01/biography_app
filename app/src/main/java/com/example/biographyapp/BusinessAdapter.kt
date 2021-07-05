package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class BusinessAdapter(context: Context,businessCategory:List<BusinessModel>)
    : ArrayAdapter<BusinessModel>(context,0,businessCategory) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view  = convertView
        val businessItem = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.business_display,parent,false)
        }

        var profilePicture = view?.findViewById<ImageView>(R.id.biz_image)
        var name = view?.findViewById<TextView>(R.id.biz_name)
        var details = view?.findViewById<TextView>(R.id.biz_description)

        businessItem?.image?.let {
            profilePicture?.setImageResource(businessItem.image)
        }

        name?.text = businessItem?.name

        details?.text = businessItem?.biography

        return view!!
    }
}