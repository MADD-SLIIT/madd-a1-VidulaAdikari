package com.example.yourappname

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Ensure this import is present and points to your package
import com.example.calorix.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize the Log In button
        val loginButton: Button = findViewById(R.id.loginButton)

        // Set OnClickListener for the Log In button
        loginButton.setOnClickListener {
            // Navigate to the Home Activity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
