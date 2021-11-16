package com.example.rng_deciding_food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loners = findViewById<Button>(R.id.btnOnePerson)
        val idiots = findViewById<Button>(R.id.btnTwoPeople)

        loners.setOnClickListener {
            val intent = Intent(this, food_place_for_loners::class.java)
            startActivity(intent)
        }

        idiots.setOnClickListener {
            val intent = Intent (this,food_place_for_two::class.java)
            startActivity(intent)
        }





    }


}