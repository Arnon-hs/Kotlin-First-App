package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val firstNumber = findViewById<EditText>(R.id.firstNumber).text.toString().toIntOrNull()
            val secondNumber = findViewById<EditText>(R.id.secondNumber).text.toString().toIntOrNull()
            if (firstNumber == null || secondNumber == null) {
                findViewById<TextView>(R.id.error).text = "Введите корректные данные!"
            }
            else {
                val result = firstNumber*firstNumber + secondNumber*secondNumber
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("RESULT", result)
                startActivity(intent)
            }
        }
    }
}