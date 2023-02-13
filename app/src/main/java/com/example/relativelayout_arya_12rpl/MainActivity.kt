package com.example.relativelayout_arya_12rpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSpinnerDay()
        setSpinnerTime()
    }

    private fun setSpinnerDay() {
        val spinnerDay: Spinner = findViewById(R.id.spin_date)

        ArrayAdapter.createFromResource(
            this,
            R.array.day,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            )
            spinnerDay.adapter = it
        }
    }

    private fun setSpinnerTime() {
        val spinnerTime: Spinner = findViewById(R.id.spin_time)

        ArrayAdapter.createFromResource(
            this,
            R.array.time,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            )
            spinnerTime.adapter = it
        }
    }
}