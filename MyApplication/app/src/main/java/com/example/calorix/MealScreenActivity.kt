package com.example.calorix

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MealScreenActivity : AppCompatActivity() {

    private lateinit var backButton: ImageView
    private lateinit var breakfastButton: Button
    private lateinit var lunchButton: Button
    private lateinit var dinnerButton: Button
    private lateinit var searchButton: Button
    private lateinit var searchEditText: EditText
    private lateinit var foodName: TextView
    private lateinit var foodRating: RatingBar
    private lateinit var foodCalories: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals)

        // Initialize Views
        backButton = findViewById(R.id.backButton)
        breakfastButton = findViewById(R.id.breakfastButton)
        lunchButton = findViewById(R.id.lunchButton)
        dinnerButton = findViewById(R.id.dinnerButton)
        searchButton = findViewById(R.id.searchButton)
        searchEditText = findViewById(R.id.searchEditText)
        foodName = findViewById(R.id.foodName)
        foodRating = findViewById(R.id.foodRating)
        foodCalories = findViewById(R.id.foodCalories)

        // Back button listener
        backButton.setOnClickListener {
            finish() // Go back to the previous activity
        }

//        // Meal type button listeners
//        breakfastButton.setOnClickListener {
//            highlightMealButton(breakfastButton)
//            Toast.makeText(this, "Breakfast selected", Toast.LENGTH_SHORT).show()
//        }
//
//        lunchButton.setOnClickListener {
//            highlightMealButton(lunchButton)
//            Toast.makeText(this, "Lunch selected", Toast.LENGTH_SHORT).show()
//        }
//
//        dinnerButton.setOnClickListener {
//            highlightMealButton(dinnerButton)
//            Toast.makeText(this, "Dinner selected", Toast.LENGTH_SHORT).show()
//        }

        // Search functionality (just as an example)
        searchButton.setOnClickListener {
            val searchTerm = searchEditText.text.toString()
            if (searchTerm.isNotEmpty()) {
                searchForFood(searchTerm)
            } else {
                Toast.makeText(this, "Please enter a search term", Toast.LENGTH_SHORT).show()
            }
        }

        // Food details can be dynamically updated here based on selected meal/food items.
        updateFoodDetails("Pancakes", 4.5f, 320)
    }

//    private fun highlightMealButton(selectedButton: Button) {
//        // Reset other buttons to default
//        breakfastButton.setBackgroundColor(resources.getColor(R.color.lightGray))
//        lunchButton.setBackgroundColor(resources.getColor(R.color.lightGray))
//        dinnerButton.setBackgroundColor(resources.getColor(R.color.lightGray))
//
//        // Highlight selected button
//        selectedButton.setBackgroundColor(resources.getColor(R.color.green))
//    }

    private fun searchForFood(searchTerm: String) {
        // This is where you'd typically implement your search logic.
        // For now, just show a Toast.
        Toast.makeText(this, "Searching for $searchTerm", Toast.LENGTH_SHORT).show()
    }

    private fun updateFoodDetails(name: String, rating: Float, calories: Int) {
        foodName.text = name
        foodRating.rating = rating
        foodCalories.text = "$calories Cal"
    }
}
