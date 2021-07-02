package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityCategoryBinding
import com.example.biographyapp.databinding.ActivityMainBinding

class CategoryActivity : AppCompatActivity() {

    var binding : ActivityCategoryBinding? = null
    var categoryAdapter : CategoryAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        categoryAdapter = CategoryAdapter(this,CategoryData.categoryModels)
        binding?.listView?.adapter = categoryAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}