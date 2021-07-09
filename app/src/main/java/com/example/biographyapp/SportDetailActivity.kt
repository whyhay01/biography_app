package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivitySportDetailBinding

class SportDetailActivity : AppCompatActivity() {

    var binding: ActivitySportDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_detail)
        binding = ActivitySportDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        getExtra()
    }

    fun getExtra(){
       var name : String? = null
        var detail: String? = null
       var image: Int = 0

        name = intent.getStringExtra(BusinessDetailActivity.NAME_EXTRA)
        detail =intent.getStringExtra(BusinessDetailActivity.DETAIL_EXTRA)
        image = intent.getIntExtra(BusinessDetailActivity.IMAGE_EXTRA, 0)

        binding?.sportDisplayName?.text =name
        binding?.sportDisplayBio?.text =detail
        binding?.sportDisplayImage?.setImageResource(image)

        title = name


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}