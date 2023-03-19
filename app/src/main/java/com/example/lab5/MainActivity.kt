package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgHome: ImageView = findViewById(R.id.imgHome)
        val imgUser:ImageView = findViewById(R.id.imgUser)
        val fragmentHome = HomeFagmant()
        val fragmentUser = UserFagment()

        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.home)
            imgUser.setImageResource(R.drawable.people)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, fragmentUser)
                commit()
            }
        }
        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.selected_home)
            imgUser.setImageResource(R.drawable.baseline_people_24)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, fragmentHome)
                commit()
            }
        }


    }
}