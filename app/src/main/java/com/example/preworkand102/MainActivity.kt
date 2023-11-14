package com.example.preworkand102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //add a toast to say hello when button is clicked
        var button = findViewById<Button>(R.id.button)
        var image = findViewById<ImageView>(R.id.imageView)
        var bunny = findViewById<ImageView>(R.id.imageBunny)
        image.setImageResource(R.drawable.hi_pic)
        button.setOnClickListener() {
            wrapper_function(button, image, bunny)
        }
    }
    private fun wrapper_function(button:Button, image:ImageView, bunny:ImageView){
        if (button.text == "Say Hi!"){
            showToastMessage()
            image.setImageResource(R.drawable.wave)
            button.text = "See the bunny"

        }else{
            bunny.visibility = View.VISIBLE
            bunny.setImageResource(R.drawable.bunny)
            image.setImageResource(R.drawable.that_was_fun)
        }

    }
    fun showToastMessage() {
        val message = "Hi! Nice to meet you!"

        // Create a Toast with the application context
        val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)

        // Show the toast
        toast.show()
    }
}