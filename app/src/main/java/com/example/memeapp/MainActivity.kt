package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.next)
        btn.setOnClickListener(){
//            Toast.makeText(applicationContext, "Going to next Page", Toast.LENGTH_SHORT).show()
            val intent=Intent(this,memePage::class.java)
            startActivity(intent)
        }


    }
}