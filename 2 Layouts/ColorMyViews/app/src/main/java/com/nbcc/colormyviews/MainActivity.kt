package com.nbcc.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        // Setting Background Color Based on ID
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }

        /*
        // Setting Background Image Based on ID
        // I couldn't figure out how to make the images stop increasing the size of the TextViews
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.image_1)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_2)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.image_3)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.image_4)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.image_5)
            else -> view.setBackgroundResource(R.drawable.background_image)
        }
        */
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val greenButton = findViewById<Button>(R.id.green_button)

        val clickableViews: List<View> = listOf(
            boxOneText,
            boxTwoText,
            boxThreeText,
            boxFourText,
            boxFiveText,
            rootConstraintLayout,
            redButton,
            yellowButton,
            greenButton
        )

        for (item in clickableViews) {
            item.setOnClickListener {makeColored(it)}
        }
    }
}
