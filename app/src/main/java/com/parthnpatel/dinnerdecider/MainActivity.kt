//PACKAGE SECTION
package com.parthnpatel.dinnerdecider

//IMPORT SECTION
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


//MAIN ACTIVITY CLASS
class MainActivity : AppCompatActivity() {

    //INITIALISING ARRAYLIST TO STORE THE FOOD ITEMS
    private val foodList= arrayListOf("PANEER TIKKA","MCALOO TIKKI BURGER","FAFDA-JALEBI")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //MAIN ACTIVITY CREATED
        setContentView(R.layout.activity_main)

        //CREATING ONCLICKLISTENER METHOD FOR BUTTON HAVING ID: decideButton
        decideButton.setOnClickListener{
            val random= Random() //OBJECT OF CLASS java.util.Random
            val randomFoodIndex=random.nextInt(foodList.count())
            foodDisplay.text = foodList[randomFoodIndex] //DISPLAYING THE RANDOMLY SELECTED FOOD

        }

        //CREATING ONCLICKLISTENER METHOD FOR BUTTON HAVING ID : addButton
        addButton.setOnClickListener {
            val newFood=addFood.text.toString()
            foodList.add(newFood)
            addFood.text.clear()
        }
    }
}