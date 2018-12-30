package com.example.dipesh.dinnerpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    val foodList = arrayListOf("Mexican", "Italian", "Pizza", "Chinese", "Tandoori")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pickButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            editFoodName.text = foodList[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFood.text.toString()
            foodList.add(newFood)
            addFood.text.clear()

            val toasttext = "New food added !"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, toasttext, duration)
            toast.show()


            print(foodList)
        }
    }
}
