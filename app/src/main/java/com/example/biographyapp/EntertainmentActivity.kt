package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityEntertainmentBinding

class EntertainmentActivity : AppCompatActivity() {

    val displayTitle = "Entertainment"

    var binding: ActivityEntertainmentBinding? = null
    var entertainersAdapter: EntertainmentAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entertainment)

        binding = ActivityEntertainmentBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        entertainersAdapter = EntertainmentAdapter(this, DataManager.entertainers)

        binding?.listView?.adapter = entertainersAdapter

        title = displayTitle
    }
}