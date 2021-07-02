package com.example.biographyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CategoryAdapter(context: Context,categories: List<Category>): ArrayAdapter<Category>(context,0,categories) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        val category = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.display_category, parent, false)
        }

        val tvCategory = view?.findViewById<TextView>(R.id.category)
        val tvDetails = view?.findViewById<TextView>(R.id.detail)

        tvCategory?.text = category?.name
        tvDetails?.text = category?.details



        return view!!
    }
}