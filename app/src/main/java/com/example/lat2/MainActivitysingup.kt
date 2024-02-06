package com.example.lat2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitysingup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        val btnlg2 = findViewById<Button>(R.id.btnlogin2)
        btnlg2.setOnClickListener {
            val Intent = Intent(this, MainActivitylogin::class.java)
            startActivity(Intent)
        }
    }
}