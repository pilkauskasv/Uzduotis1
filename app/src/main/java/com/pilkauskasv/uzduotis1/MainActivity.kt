package com.pilkauskasv.uzduotis1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
// ...



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val btnText = findViewById<Button>(R.id.btnText)

        val btnColor = findViewById<Button>(R.id.btnColor)

        val btnBackground = findViewById<Button>(R.id.btnBackground)

        btnBackground.setOnClickListener {
            textView.setBackgroundColor(Color.YELLOW)
        }

        btnColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        btnText.setOnClickListener {
            textView.text = "Sveikas, pasauli!"
        }
    }
}