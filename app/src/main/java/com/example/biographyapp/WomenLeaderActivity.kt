package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityWomenLeaderBinding

class WomenLeaderActivity : AppCompatActivity() {

    val displayTitle = "Women Leaders"

    var binding: ActivityWomenLeaderBinding? = null

    var womanLeaderAdapter: WomenLeaderAdapter? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_women_leader)

        binding = ActivityWomenLeaderBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)


        //Setting up Adapter
        womanLeaderAdapter = WomenLeaderAdapter(this, DataManager.womenLeaders)
        binding?.listView?.adapter = womanLeaderAdapter

        title = displayTitle


    }
}