package com.example.calorix

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FoodItemActivity : AppCompatActivity() {

    private lateinit var foodImageView: ImageView
    private lateinit var foodNameTextView: TextView
    private lateinit var foodRatingBar: RatingBar
    private lateinit var ingredientTag1: TextView
    private lateinit var ingredientTag2: TextView
    private lateinit var ingredientTag3: TextView
    private lateinit var editButton: Button
    private lateinit var backButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_item)


        // Initialize views
        foodImageView = findViewById(R.id.foodImageView)
        foodNameTextView = findViewById(R.id.foodNameTextView)
        foodRatingBar = findViewById(R.id.foodRating)
        ingredientTag1 = findViewById(R.id.ingredientTag1)
        ingredientTag2 = findViewById(R.id.ingredientTag2)
        ingredientTag3 = findViewById(R.id.ingredientTag3)
        editButton = findViewById(R.id.editButton)
        backButton = findViewById(R.id.backButton)

        // Set sample data
        foodNameTextView.text = "Scrambled Eggs"
        foodRatingBar.rating = 4.0f
        ingredientTag1.text = "Large Eggs 2"
        ingredientTag2.text = "Wheat Bread 2"
        ingredientTag3.text = "Butter"

        // Back button functionality
        backButton.setOnClickListener {
            finish() // Closes the activity and returns to the previous screen
        }

        // Edit button functionality
        editButton.setOnClickListener {
            // Handle editing functionality
            // For example, start an activity to edit the food details
        }

        // You can also handle dynamic ingredient tags if required
        // Add more ingredient tags dynamically based on the food item data
    }
}
