package com.example.homework

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CheckboxActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle? ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        val firstCheckboxInActivity = findViewById<CheckBox>(R.id.cbFirstFilm)
        val secondCheckboxInActivity = findViewById<CheckBox>(R.id.cbSecondFilm)
        val thirdCheckboxInActivity = findViewById<CheckBox>(R.id.cbThirdFilm)
        val btnBack =findViewById<Button>(R.id.btnCheckbox)

        btnBack.setOnClickListener {
            val firstCheckboxInActivity = firstCheckboxInActivity.isChecked
            val secondCheckboxInActivity = secondCheckboxInActivity.isChecked
            val thirdCheckboxInActivity = thirdCheckboxInActivity.isChecked

            val intent = Intent( this, MainActivity::class.java)
            intent.putExtra("firstCheckboxInActivity", firstCheckboxInActivity)
            intent.putExtra("secondCheckboxInActivity", secondCheckboxInActivity)
            intent.putExtra("thirdCheckboxInActivity", thirdCheckboxInActivity)


            startActivity(intent)
        }

    }
}