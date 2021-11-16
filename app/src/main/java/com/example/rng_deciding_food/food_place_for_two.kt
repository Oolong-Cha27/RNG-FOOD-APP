package com.example.rng_deciding_food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class food_place_for_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_place_for_two)

        val loner = findViewById<Button>(R.id.buttonStartTwo)
        val img = findViewById<ImageView>(R.id.ivTwoOrMore)
        val randImage = arrayListOf(
            R.drawable.burger,
            R.drawable.curryhouse,
            R.drawable.hawaiianfood,
            R.drawable.koreanfood,
            R.drawable.lunchables,
            R.drawable.mcdonalds,
            R.drawable.mexicanfood,
            R.drawable.poke,
            R.drawable.pizza,
            R.drawable.steak,
            R.drawable.wendys,
            R.drawable.zippys,
            R.drawable.pho,
            R.drawable.chickenfactory,
            R.drawable.filipinofood,
            R.drawable.hotpotheaven,
            R.drawable.italianfood,
            R.drawable.lnl,
            R.drawable.koromo,
            R.drawable.shabuya,
            R.drawable.surahawaii,
            R.drawable.sikdorak,
            R.drawable.sushi,
            R.drawable.tanakaramen,
            R.drawable.wagaya)
        loner.setOnClickListener {
            val random = randImage.random()
            img.setBackgroundResource(random)
        }


    }
}