package com.webaligo.nucalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.children

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting click listeners for all calculator buttons
        val bntPanel : LinearLayout = findViewById<LinearLayout>(R.id.btnPanel)
        for(row in bntPanel.children) {
            for (bnt in (row as LinearLayout).children) {
                bnt.setOnClickListener {
                    onDigit(bnt as Button)
                }
            }
        }
    }

    private fun onDigit(button: Button){
        Toast.makeText(this, "${button.text}", Toast.LENGTH_SHORT).show()
    }
}