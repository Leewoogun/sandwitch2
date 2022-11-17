package com.example.sandwitchkiosk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.table)

        val btnTableNum1 = findViewById<ImageButton>(R.id.table_btn_num1)
        val btnTableNum2 = findViewById<ImageButton>(R.id.table_btn_num2)
        val btnTableNum3 = findViewById<ImageButton>(R.id.table_btn_num3)



    }
}