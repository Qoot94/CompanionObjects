package com.example.companionobjects

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val background = findViewById<ConstraintLayout>(R.id.clMain)
        val header= findViewById<TextView>(R.id.tvMain)
        val inputText= findViewById<EditText>(R.id.etDayNight)
        val changeBackgroundBT = findViewById<Button>(R.id.btChange)


changeBackgroundBT.setOnClickListener {
    when {
        inputText.text.toString() == "day" -> {
            CompClass.time = "day"
            CompClass.changeBK(background)
            header.setTextColor(Color.BLACK)
            inputText.setTextColor(Color.BLACK)
            changeBackgroundBT.setBackgroundColor(Color.BLACK)
        }
        inputText.text.toString() == "night" -> {
            CompClass.time = "night"
            CompClass.changeBK(background)
            header.setTextColor(Color.WHITE)
            inputText.setTextColor(Color.WHITE)
            changeBackgroundBT.setBackgroundColor(Color.WHITE)
        }
        else -> {
            CompClass.time = "  "
            CompClass.changeBK(background)
            header.setTextColor(Color.BLACK)
            inputText.setTextColor(Color.BLACK)
            changeBackgroundBT.setBackgroundColor(Color.BLACK)
        }
    }

}
    }
}