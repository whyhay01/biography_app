package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityTechBinding

class TechActivity : AppCompatActivity() {

    val displayTitle = "Tech"

    var binding : ActivityTechBinding? = null
    var techAdapter: TechAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech)
        binding = ActivityTechBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        techAdapter = TechAdapter(this,TechData.techItems)

        binding?.listView?.adapter = techAdapter

        title = displayTitle
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}