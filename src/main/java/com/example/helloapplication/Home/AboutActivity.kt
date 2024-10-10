package com.example.helloapplication.Home


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloapplication.ContactActivity
import com.example.helloapplication.R
import org.w3c.dom.Text

class AboutActivity : AppCompatActivity() {
    private lateinit var button3: Button
    private lateinit var imageView2: ImageView
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)
        imageView2 = findViewById<ImageView>(R.id.imageView2)
         button3 = findViewById<Button>(R.id.button3)


         imageView2.setOnClickListener {
            finish()
        }

         button3.setOnClickListener {
             val intent = Intent(this, ContactActivity::class.java)
             startActivity(intent)
         }
    }
}