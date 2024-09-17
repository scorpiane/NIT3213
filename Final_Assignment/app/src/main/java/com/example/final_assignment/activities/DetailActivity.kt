package com.example.final_assignment.activities

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.final_assignment.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Getting values from my adapter
        val artworkTitle = intent.getStringExtra("artworkTitle")
        val artist = intent.getStringExtra("artist")
        val medium = intent.getStringExtra("medium")
        val year = intent.getStringExtra("year")
        val description = intent.getStringExtra("description")
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Find views and set data
       val titleTextView: TextView = findViewById(R.id.artwork_title)
        val artistTextView: TextView = findViewById(R.id.artist_name)
        val mediumTextView: TextView = findViewById(R.id.artwork_medium)
        val yearTextView: TextView = findViewById(R.id.artwork_year)
        val descriptionTextView: TextView = findViewById(R.id.artwork_description)
        val imageView: ImageView = findViewById(R.id.artwork_image)
        val backButton : TextView = findViewById(R.id.back_button)

        //Setting the values to their corresponding views
        titleTextView.text = artworkTitle
        artistTextView.text = "by $artist"
        mediumTextView.text = "Medium: $medium"
        yearTextView.text = "Year: $year"
        descriptionTextView.text = description

        imageView.setImageResource(0) // Clear previous image
        imageView.setBackgroundResource(0) // Clear any background
        imageView.setImageResource(imageResId)

        if (imageResId == R.drawable.img1){
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER

        } else {
            // Set the default scaleType for other images
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP

        }


        backButton.setOnClickListener{
            val intent = Intent(this@DetailActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}