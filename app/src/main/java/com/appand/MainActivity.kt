package com.appand

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a ConstraintLayout as the root view
        val layout = ConstraintLayout(this)
        setContentView(layout)

        // Create and configure the button
        val button = Button(this).apply {
            text = "Click Me"
            id = generateViewId()
        }

        // Create ConstraintLayout parameters for the button
        val params = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        // Center the button in the layout
        params.apply {
            topToTop = ConstraintLayout.LayoutParams.PARENT_ID
            bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
            startToStart = ConstraintLayout.LayoutParams.PARENT_ID
            endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
        }

        // Add the button to the layout with the specified parameters
        layout.addView(button, params)

        // Set click listener for the button
        button.setOnClickListener {
            Toast.makeText(this, "Test 1 Successful", Toast.LENGTH_SHORT).show()
        }
    }
}
