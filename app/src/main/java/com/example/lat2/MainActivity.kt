package com.example.lat2

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val btnintro = findViewById<TextView>(R.id.buttonintro)
        btnintro.setOnClickListener {
            val intent = Intent(this, MainActivitylogin::class.java)
            startActivity(intent)
        }

    }
}