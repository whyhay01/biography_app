package com.example.biographyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.biographyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding?.root
        setContentView(view)

        val SPLASHSCREENTIMEOUT = 4000

        val intent = Intent(applicationContext,CategoryActivity::class.java)

        Handler().postDelayed({
            startActivity(intent)
            finish()
        },SPLASHSCREENTIMEOUT.toLong())

    }
}