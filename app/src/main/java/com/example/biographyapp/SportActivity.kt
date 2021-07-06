package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivitySportBinding

class SportActivity : AppCompatActivity() {

    var binding: ActivitySportBinding? = null
    var sportAdapter : SportAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport)
        binding = ActivitySportBinding.inflate(layoutInflater)

        var view = binding?.root
        setContentView(view)

        sportAdapter = SportAdapter(this,SportData.SportItems)

        binding?.listView?.adapter =sportAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}