package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityBusinessDisplayBinding

class BusinessDisplayActivity : AppCompatActivity() {
    var binding: ActivityBusinessDisplayBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business_display)
        binding = ActivityBusinessDisplayBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        getExtra()


    }

    fun getExtra(){

        var profilePicture: Int = 0
        var description: String? = null
        var name: String? = null

        profilePicture = intent.getIntExtra(IMAGE_EXTRA, 0)
        description = intent.getStringExtra(DETAIL_EXTRA)
        name = intent.getStringExtra(NAME_EXTRA)


        binding?.bizDisplayImage?.setImageResource(profilePicture)
        binding?.bizDisplayBio?.text = description
        binding?.bizDisplayName?.text = name

        title = name

    }

    companion object{
        const val IMAGE_EXTRA = "image_extra"
        const val NAME_EXTRA = "name_extra"
        const val DETAIL_EXTRA = "detail_extra"
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}