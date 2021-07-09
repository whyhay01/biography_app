package com.example.biographyapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class TechAdapter(context: Context, techCategory: List<TechModel>)
    :ArrayAdapter<TechModel>(context,0,techCategory){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        var techItems = getItem(position)

        if (view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.tech_display,parent,false)
        }

        val profilePicture = view?.findViewById<ImageView>(R.id.tech_image)
        val name = view?.findViewById<TextView>(R.id.tech_name)
        val detail = view?.findViewById<TextView>(R.id.tech_description)

        name?.text = techItems?.name
        detail?.text = techItems?.description

        techItems?.image?.let {
            profilePicture?.setImageResource(techItems.image)
        }

        view?.setOnClickListener {
            var intent = Intent(parent.context, TechDetailActivity::class.java,)
            intent.putExtra(BusinessDetailActivity.NAME_EXTRA, techItems?.name)
            intent.putExtra(BusinessDetailActivity.DETAIL_EXTRA, techItems?.description)
            intent.putExtra(BusinessDetailActivity.IMAGE_EXTRA, techItems?.image)
            parent.context.startActivity(intent)
        }

        return view!!
    }

}