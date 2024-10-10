package com.example.helloapplication
import android.content.Intent
import android.os.Bundle
import android.content.SharedPreferences
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapplication.Home.HomepageActivity

class SignupActivity : AppCompatActivity() {
    private lateinit var textViewLoginOption: TextView
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.sign_up);
        val nameEditText = findViewById<EditText>(R.id.Fullname_input)
        val emailEditText = findViewById<EditText>(R.id.Email_input)
        val passwordEditText = findViewById<EditText>(R.id.Password_input)
        val button2 = findViewById<Button>(R.id.button2)
         textViewLoginOption = findViewById<EditText>(R.id.textViewLoginOption)

        button2.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val sharedPreferences = getSharedPreferences("user_credentials", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("name", name)
            editor.putString("email", email)
            editor.putString("password", password)
            editor.apply()

//            val intent = Intent(this, homeActivity::class.java)
//            startActivity(intent)


            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {

                val intent = Intent(this, HomepageActivity::class.java)
                    startActivity(intent)
                    finish()
            } else {

                Toast.makeText(this, "Please enter all credentials", Toast.LENGTH_SHORT).show()
            }

        }


        textViewLoginOption.setOnClickListener {
            val intent = Intent(this, login_pageActivity::class.java)
            startActivity(intent)
            finish()

        }




    }
}




