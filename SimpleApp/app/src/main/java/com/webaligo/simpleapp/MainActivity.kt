package com.webaligo.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clickCount = 0
        val helloBtn = findViewById<Button>(R.id.helloButton)
        val helloTxtView = findViewById<TextView>(R.id.helloText)

        helloBtn.setOnClickListener {
            helloTxtView.text = (++clickCount).toString()
            Toast.makeText(this, "Clicked " + clickCount.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}