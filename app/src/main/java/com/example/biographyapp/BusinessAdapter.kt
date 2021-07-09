package com.example.biographyapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class BusinessAdapter(context: Context,businessCategory:List<BusinessModel>)
    : ArrayAdapter<BusinessModel>(context,0,businessCategory) {

//    lateinit var view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
         var view  = convertView
        var businessItem = getItem(position)
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

    //Displaying on the DisplayActivity

        view?.setOnClickListener {
            var intent = Intent(parent.context, BusinessDetailActivity::class.java)
            intent.putExtra(BusinessDetailActivity.NAME_EXTRA, businessItem?.name)
            intent.putExtra(BusinessDetailActivity.DETAIL_EXTRA, businessItem?.biography)
            intent.putExtra(BusinessDetailActivity.IMAGE_EXTRA, businessItem?.image)
            parent.context.startActivity(intent)
        }


        return view!!
    }

//    fun clickEvent( view: View, businessValue:BusinessModel){
//        view?.setOnClickListener {
//           val intent = Intent(context,BusinessDisplayActivity::class.java)
//            intent.putExtra(BusinessDisplayActivity.NAME_EXTRA,businessValue )
//        }
//
//    }
}