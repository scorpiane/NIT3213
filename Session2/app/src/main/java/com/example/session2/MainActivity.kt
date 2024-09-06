package com.example.session2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.ny_first_screen)

        val textView: TextView = findViewById(R.id.textView)
        val myButton: Button = findViewById(R.id.button)

        textView.setOnClickListener {
            textView.text = "You clicked me!"
        }

        myButton.setOnClickListener {
            Snackbar.make(it, "Button Clicked", Snackbar.LENGTH_LONG).show()
        }
    }
}