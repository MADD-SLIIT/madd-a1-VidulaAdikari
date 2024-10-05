package com.example.yourappname

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// Import the correct R class for accessing resources
import com.example.calorix.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to your home layout file
        setContentView(R.layout.activity_home)
    }
}

