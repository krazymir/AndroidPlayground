package com.webaligo.agecalc

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    var tvSelectedDate: TextView? = null
    var tvAgeInMinutes: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDatePicker: Button = findViewById<Button>(R.id.selectDateBtn)

        btnDatePicker.setOnClickListener {
            datePickerClicked()
        }
    }

    private fun datePickerClicked() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DATE)
        val datePicker = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                tvSelectedDate = findViewById<TextView>(R.id.selectedDateText)
                tvAgeInMinutes = findViewById<TextView>(R.id.ageInMinutes)
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                tvSelectedDate?.text = "$dayOfMonth/${month + 1}/$year"
                val selectedDate = sdf.parse("$dayOfMonth/${month + 1}/$year")
                selectedDate?.let {
                    val selectedDateInWeeks = selectedDate.time / 604800000
                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                    currentDate?.let {
                        tvAgeInMinutes?.text =
                            ((currentDate.time / 604800000) - selectedDateInWeeks).toString()
                    }
                }

            },
            year,
            month,
            day,
        )
        datePicker.datePicker.setMaxDate(System.currentTimeMillis() - 86400000)
        datePicker.show()
    }
}