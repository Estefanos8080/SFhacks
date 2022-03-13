package com.example.sfhacks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class signup: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_signup)

        val signup = findViewById(R.id.signup) as Button
        val username = findViewById(R.id.First_Last_Name) as EditText
        val Email = findViewById(R.id.email) as EditText
        val password = findViewById(R.id.password) as EditText
        val C_password = findViewById(R.id.confirm_password) as EditText


        signup.setOnClickListener{
            if(username.equals("user") && password.equals("12345") && C_password.equals("12345") && (Email != null)){
                val intent = Intent(this, User_Entery_To_suggestion::class.java)
                startActivity(intent)

            }
        }
    }
}

