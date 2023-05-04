package com.webaligo.nucalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.children

class MainActivity : AppCompatActivity() {
    private var tvDisplay : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)
        // Setting click listeners for all calculator buttons
        val bntPanel : LinearLayout = findViewById<LinearLayout>(R.id.btnPanel)
        for(row in bntPanel.children) {
            for (btn in (row as LinearLayout).children) {
                when ((btn as Button).text){
                    "CLR" -> btn.setOnClickListener {
                        onClear(btn as Button)
                    }
                    else -> btn.setOnClickListener {
                        onDigit(btn as Button)
                    }
                }
            }
        }
    }

    private fun onDigit(button: Button){
        tvDisplay?.append(button.text)
    }

    private fun onClear(button: Button){
        tvDisplay?.text = ""
    }
}