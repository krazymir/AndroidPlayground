package com.webaligo.agecalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    var tvSelectedDate : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDatePicker: Button = findViewById<Button>(R.id.selectDateBtn)

        btnDatePicker.setOnClickListener{
            datePickerClicked()
        }
    }

    private fun datePickerClicked(){
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DATE)
        DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                tvSelectedDate = findViewById<TextView>(R.id.selectedDateText)
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                tvSelectedDate?.setText("$dayOfMonth/${month + 1}/$year")
                val date = sdf.parse("$dayOfMonth/${month + 1}/$year")
            },
            year,
            month,
            day,
        ).show()
    }
}