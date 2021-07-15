package com.example.biographyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.biographyapp.databinding.ActivityCategoryBinding
import com.example.biographyapp.databinding.ActivityMainBinding

class CategoryActivity : AppCompatActivity() {

    var binding : ActivityCategoryBinding? = null
    var categoryAdapter : CategoryAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        categoryAdapter = CategoryAdapter(this,CategoryData.categoryModels)
        binding?.listView?.adapter = categoryAdapter


        binding?.listView?.setOnItemClickListener { parent, view, position, id ->
            when(position){
                0 ->{
                    var  intent = Intent(applicationContext, BusinessActivity::class.java)
                    startActivity(intent)
                }
                1 ->{
                    var intent = Intent(applicationContext, SportActivity::class.java)
                    startActivity(intent)
                }
                2 -> {
                    var intent = Intent(applicationContext, PoliticsActivity::class.java)
                    startActivity(intent)
                }
                3 ->{
                    var intent = Intent(applicationContext, TechActivity::class.java)
                    startActivity(intent)
                }
                4 ->{
                    var intent = Intent(applicationContext, VisionariesActivity::class.java)
                    startActivity(intent)
                }
                5 ->{
                    var intent = Intent(applicationContext, EntertainmentActivity::class.java)
                    startActivity(intent)
                }
                6 ->{
                    var intent = Intent(applicationContext, InventorActivity::class.java)
                    startActivity(intent)
                }
                7 ->{
                    var intent = Intent(applicationContext, LeadershipActivity::class.java)
                    startActivity(intent)
                }
                8 ->{
                    var intent = Intent(applicationContext, WomenLeaderActivity::class.java)
                    startActivity(intent)
                }

            }
        }

        }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}