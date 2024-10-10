package com.example.helloapplication.Home

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloapplication.R

class SkillsActivity : AppCompatActivity() {
    private lateinit var imageView2 :ImageView
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_skills)
        imageView2 = findViewById<ImageView>(R.id.imageView2)


        imageView2.setOnClickListener {
            finish()
        }
    }
}