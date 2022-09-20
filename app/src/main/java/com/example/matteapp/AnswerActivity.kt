package com.example.matteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    lateinit var resultTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        resultTextView = findViewById(R.id.resultView)

        val answer = intent.getBooleanExtra("answeredCorrect" , false)
        val button = findViewById<Button>(R.id.backButton)

        button.setOnClickListener {
            finish()
        }

        //Log.d("!!!", "Rätt? $answer")

        if (answer) {
            resultTextView.text = "Rätt svar"
        } else {
            resultTextView.text = "Fel svar"
        }

    }
}