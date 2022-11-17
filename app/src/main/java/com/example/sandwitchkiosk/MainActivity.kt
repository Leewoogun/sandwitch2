package com.example.sandwitchkiosk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val btnHall = findViewById<Button>(R.id.main_btn_hall)
        btnHall.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)

        })
    }
}