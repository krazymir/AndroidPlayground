package com.webaligo.agecalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDatePicker: Button = findViewById<Button>(R.id.selectDateBtn)
        btnDatePicker.setOnClickListener{
            datePickerClicked()
        }
    }

    private fun datePickerClicked(){
        Toast.makeText(this, "Date picker pressed!", Toast.LENGTH_LONG).show()
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DATE)
    }
}