package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView // We added ImageView here!
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Find our Picture Frame and Button
        val rollButton: Button = findViewById(R.id.buttonRoll)
        val diceImage: ImageView = findViewById(R.id.imageViewDice)

        // 2. Tell the button what to do when tapped
        rollButton.setOnClickListener {
            // Pick a random number between 1 and 6
            val randomNum = (1..6).random()

            // Match the number to the correct picture
            val imageResource = when (randomNum) {
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice1
            }

            // Put the chosen picture into the Picture Frame
            diceImage.setImageResource(imageResource)
        }
    }
}