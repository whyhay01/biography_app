package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.databinding.ActivityInventorBinding

class InventorActivity : AppCompatActivity() {

    var binding: ActivityInventorBinding? = null

    var inventorAdapter: InventorsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventor)

        binding = ActivityInventorBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        inventorAdapter = InventorsAdapter(this,DataManager.inventors)

        binding?.listView?.adapter = inventorAdapter
    }
}