package com.example.helloapplication

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapplication.Home.HomepageActivity
import org.w3c.dom.Text

//import org.w3c.dom.Text View

class login_pageActivity : AppCompatActivity() {
    private lateinit var textViewSign2: Text
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_page)
        // Find the views by their ID
        val emailEditText = findViewById<EditText>(R.id.Email_input)
        val passwordEditText = findViewById<EditText>(R.id.Password_input)
        val button = findViewById<Button>(R.id.button)
         val  textViewSign2 = findViewById<TextView>(R.id.textViewSign2)


        button.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val sharedPreferences = getSharedPreferences("user_credentials", MODE_PRIVATE)
            val storedEmail = sharedPreferences.getString("email", "")
            val storedPassword = sharedPreferences.getString("password", "")

            if (email == storedEmail && password == storedPassword) {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomepageActivity::class.java)
                startActivity(intent)
                finish()
            } else {

                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()            }
        }


        textViewSign2.setOnClickListener{
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}