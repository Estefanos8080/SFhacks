package com.example.sfhacks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        val login = findViewById(R.id.login) as Button
        val username = findViewById(R.id.username) as EditText
        val password = findViewById(R.id.password) as EditText


        login.setOnClickListener{
            if(username.equals("admin") && password.equals("1234")){
                val intent = Intent(this, User_Entery_To_suggestion::class.java)
                startActivity(intent)

            }
        }
    }
}

