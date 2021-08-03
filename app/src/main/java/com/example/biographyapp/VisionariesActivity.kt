package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityVisionariesBinding

class VisionariesActivity : AppCompatActivity() {

    val displayTitle = "Visionary Leaders"

    var binding: ActivityVisionariesBinding? = null
    var visionAdapter: VisionaryAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visionaries)

        binding = ActivityVisionariesBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        visionAdapter = VisionaryAdapter(this,DataManager.visionaries)

        binding?.listView?.adapter = visionAdapter

        title = displayTitle
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}