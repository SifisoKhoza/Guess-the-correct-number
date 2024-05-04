package com.example.guessthecorrectnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val enterImageButton1 = findViewById<ImageButton>(R.id.enterImageButton1)
        val clearImageButton2 = findViewById<ImageButton>(R.id.clearImageButton2)
        val enterAgeText = findViewById<EditText>(R.id.enterAgeText)



        enterImageButton1.setOnClickListener {
            val number: Int = enterAgeText.text.toString().toInt()

            if (number < 20) {
                resultTextView.text = "The number you have entered is too low"
                enterAgeText.text.clear()
            }
            else if (number > 50) {

            resultTextView.text = "The number you have entered is too high"
                enterAgeText.text.clear()
            }

            else {resultTextView.text = "Congratulations the number you have entered is correct"
                enterAgeText.text.clear()}

            clearImageButton2.setOnClickListener { enterAgeText.text.clear()
            resultTextView.text = ""}

        }
    }

}