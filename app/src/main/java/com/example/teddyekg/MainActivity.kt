package com.example.teddyekg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ecgButton: Button = findViewById(R.id.button)
        ecgButton.setOnClickListener {
            val ecgGIF: ImageView = findViewById(R.id.gifImageView2)
            if (ecgGIF.visibility == View.VISIBLE) {
                ecgGIF.visibility = View.INVISIBLE
            } else {
                ecgGIF.visibility = View.VISIBLE
            }

        }
    }
}