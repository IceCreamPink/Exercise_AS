package com.example.lat2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitylogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitylogin)
        val btnlogin = findViewById<Button>(R.id.register)
        btnlogin.setOnClickListener {
            val Intent = Intent(this, MainActivitysingup::class.java)
            startActivity(Intent)
        }
    }
}