package com.example.pingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        val mainMenu = findViewById<Button>(R.id.mainMenu)
        val back = findViewById<Button>(R.id.BackResults)
        val resultView = findViewById<TextView>(R.id.ipResults)

        var results = intent.getStringExtra("RESULTS")

        resultView.text = results

        mainMenu.setOnClickListener {
            val mainMenuIntent = Intent(this,MainActivity::class.java)
            startActivity(mainMenuIntent)
        }

        back.setOnClickListener {
            val backIntent = Intent(this,Menu::class.java)
            startActivity(backIntent)
        }
    }
}