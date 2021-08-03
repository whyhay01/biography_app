package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityPoliticsBinding

class PoliticsActivity : AppCompatActivity() {

    val displayTitle = "Politics"

    var binding: ActivityPoliticsBinding? = null
    lateinit var politicsAdapter: PoliticsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politics)
        binding = ActivityPoliticsBinding.inflate(layoutInflater)
        var view = binding?.root
        setContentView(view)

        politicsAdapter = PoliticsAdapter(this,PoliticsData.politicsItems)

        binding?.listView?.adapter = politicsAdapter

        title = displayTitle
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}