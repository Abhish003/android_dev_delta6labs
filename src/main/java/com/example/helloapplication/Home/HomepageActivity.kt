package com.example.helloapplication.Home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloapplication.ContactActivity
import com.example.helloapplication.R
import com.example.helloapplication.login_pageActivity

class HomepageActivity : AppCompatActivity() {

    private lateinit var text_about: TextView
    private lateinit var text_skill: TextView
    private lateinit var text_contact: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        text_about = findViewById<EditText>(R.id.text_about)
        text_skill = findViewById<EditText>(R.id.text_skill)
        text_contact = findViewById<EditText>(R.id.text_contact)

        text_about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        text_skill.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        text_contact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }




    }

}