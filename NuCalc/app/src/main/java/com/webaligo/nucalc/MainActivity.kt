package com.webaligo.nucalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.children

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bntPanel : LinearLayout = findViewById<LinearLayout>(R.id.btnPanel)
        for(bnt in bntPanel.children){
            bnt.setOnClickListener {
                onDigit(bnt)
            }
        }
    }

    private fun onDigit(view: View){
        Toast.makeText(this, "Click", Toast.LENGTH_LONG).show()
    }
}