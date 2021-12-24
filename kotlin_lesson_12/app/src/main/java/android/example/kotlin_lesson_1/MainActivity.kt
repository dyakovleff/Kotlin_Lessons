package android.example.kotlin_lesson_1

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

var numberF:Float =0.0F
var ch:Char = 'F'
const val ch1 = 'C'
var number:Int = 3233333

var text_Hello:TextView? = null
var cLayout:ConstraintLayout? = null

var counter:Int = 0
var start:Boolean = false


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_Hello = findViewById(R.id.text_Hello)
        cLayout = findViewById(R.id.cLayout)
        text_Hello?.setText(number.toString())

        Thread {
              start = true
            while (start){
                Thread.sleep(1000)

                runOnUiThread {
                    if (counter == 5) cLayout?.setBackgroundColor(Color.BLUE)
                    text_Hello?.setText(counter.toString())
                    counter++
                }
            }
        }.start()


    }

    override fun onDestroy() {
        super.onDestroy()
        start = false
    }
}