package com.example.biographyapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CategoryAdapter(context: Context,categories: List<Category>): ArrayAdapter<Category>(context,0,categories) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        var category = getItem(position)
        var itemPosition: Int = getItemViewType(position)
        if (view == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.display_category, parent, false)
        }

        val tvCategory = view?.findViewById<TextView>(R.id.category)
        val tvDetails = view?.findViewById<TextView>(R.id.detail)

        tvCategory?.text = category?.name
        tvDetails?.text = category?.details


//        view?.setOnClickListener {
//               if (itemPosition ==0){
//                   var intent = Intent(parent.context, BusinessActivity::class.java)
//                   parent.context.startActivity(intent)
//               }else if (itemPosition == 1){
//                   var intent = Intent(parent.context, SportActivity::class.java)
//                   parent.context.startActivity(intent)
//               }else if (itemPosition == 2){
//                   var intent = Intent(parent.context, PoliticsActivity::class.java)
//                   parent.context.startActivity(intent)
//               }
//        }

        return view!!
    }
}