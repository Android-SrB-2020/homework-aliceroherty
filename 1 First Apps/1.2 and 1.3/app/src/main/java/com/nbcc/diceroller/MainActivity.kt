package com.nbcc.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    //This should be avoided as it complicates code
    //var diceImage1: ImageView? = null

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView
    val TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Logging Using Logcat
        Log.d(TAG, "In the onCreate event.")

        //Getting Views
        /*val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }*/

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

        /*diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)*/

        findViewById<Button>(R.id.roll_button).setOnClickListener {
            findViewById<ImageView>(R.id.dice_image1).setImageResource(rollDice())
            findViewById<ImageView>(R.id.dice_image2).setImageResource(rollDice())
        }
    }

    /*private fun rollDice() {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        //resultText.text = randomInt.toString()
        var randomInt = Random().nextInt(6) + 1

        var drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(drawableResource)

        randomInt = Random().nextInt(6) + 1

        drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage2.setImageResource(drawableResource)
    }*/

    private fun rollDice() : Int {
        // 1..6 represents a range from 1 to 6
        // random() will randomly select a number from that range
        val randomInt = (1..6).random()

        // When is similar to a classic switch statement
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun reset() {
        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "0"
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "In onResume event.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "In onPause event.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "In onStart event.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "In onRestart event.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "In onStop event.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "In onDestroy event.")
    }
}
