package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityBusinessBinding
import com.example.biographyapp.databinding.ActivityCategoryBinding

class BusinessActivity : AppCompatActivity() {

    val DISPLAY_TITLE = "Business"

    var binding : ActivityBusinessBinding? = null
    var businessAdapter : BusinessAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business)
        binding = ActivityBusinessBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        businessAdapter = BusinessAdapter(this,BusinessData.BusinessItem)
        binding?.bizListView?.adapter = businessAdapter

        title = DISPLAY_TITLE
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}