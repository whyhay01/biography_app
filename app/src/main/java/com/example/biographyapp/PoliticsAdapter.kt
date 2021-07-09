package com.example.biographyapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PoliticsAdapter(context: Context,politicsCategory: List<PoliticsModel>):
    ArrayAdapter<PoliticsModel>(context,0,politicsCategory){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        var politicsItems = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.politics_display,parent,false)
        }

        var profilePicture = view?.findViewById<ImageView>(R.id.politics_image)
        val name = view?.findViewById<TextView>(R.id.politics_name)
        val detail = view?.findViewById<TextView>(R.id.politics_description)

        name?.text = politicsItems?.name
        detail?.text = politicsItems?.description

        if (politicsItems != null) {
            politicsItems?.image.let {
                profilePicture?.setImageResource(politicsItems.image)
            }

            view?.setOnClickListener {
                var intent =  Intent(parent.context, PoliticsDetailActivity::class.java)
                intent.putExtra(BusinessDetailActivity.NAME_EXTRA, politicsItems.name)
                intent.putExtra(BusinessDetailActivity.DETAIL_EXTRA, politicsItems.description)
                intent.putExtra(BusinessDetailActivity.IMAGE_EXTRA,politicsItems.image)
                parent.context.startActivity(intent)
            }
        }

        return view!!
    }
}