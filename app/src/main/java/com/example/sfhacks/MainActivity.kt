package com.example.sfhacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.*
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn_o = findViewById(R.id.Button) as Button
        val btn_t = findViewById(R.id.Button2) as Button
        btn_o.setOnClickListener{

            val intent = Intent(this, login::class.java)
            startActivity(intent)


        }
        btn_t.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)

        }



    }

}


