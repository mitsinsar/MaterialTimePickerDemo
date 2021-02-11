package com.kangarootech.materialtimepicker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.timepicker.MaterialTimePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showPicker()

        findViewById<MaterialButton>(R.id.showPickerButton).apply {
            setOnClickListener { showPicker() }
        }
    }

    private fun showPicker() {
        MaterialTimePicker.Builder().build().show(supportFragmentManager, "")
    }
}
