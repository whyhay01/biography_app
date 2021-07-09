package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityTechDetailBinding

class TechDetailActivity : AppCompatActivity() {
    var binding: ActivityTechDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_detail)

        binding = ActivityTechDetailBinding.inflate(layoutInflater)
        var view = binding?.root
        setContentView(view)
        getExtra()
    }

    private fun getExtra() {
        var name: String? = null
        var details: String? = null
        var profilePicture: Int = 0

        //Getting Extra passed from intent
        name = intent.getStringExtra(BusinessDetailActivity.NAME_EXTRA)
        details = intent.getStringExtra(BusinessDetailActivity.DETAIL_EXTRA)
        profilePicture = intent.getIntExtra(BusinessDetailActivity.IMAGE_EXTRA, 0)

        //Setting up the Extra to display
        binding?.techDisplayName?.text = name
        binding?.techDisplayBio?.text = details
        binding?.techDisplayImage?.setImageResource(profilePicture)
        title = name

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}