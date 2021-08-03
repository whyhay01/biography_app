package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityPoliticsDetailBinding

class PoliticsDetailActivity : AppCompatActivity() {
    var binding : ActivityPoliticsDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politics_detail)
        binding = ActivityPoliticsDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        getExtra()
    }

    fun getExtra(){
        var name: String? = null
        var detail: String? = null
        var image: Int = 0

        name = intent.getStringExtra(BusinessDetailActivity.NAME_EXTRA)
        detail = intent.getStringExtra(BusinessDetailActivity.DETAIL_EXTRA)
        image = intent.getIntExtra(BusinessDetailActivity.IMAGE_EXTRA, 0)

//        binding?.politicsDisplayName?.text = name
        binding?.politicsDisplayBio?.text = detail
        binding?.politicsDisplayImage?.setImageResource(image)

        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}