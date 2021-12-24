package android.example.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number1:Int = 5
    private var number2:Int = 6
    private var text:String = "В <магазине> осталось яблока а может и <больше кто знает> и <один> <два> <три>"
    private var tvText: TextView? = null
    private var tvText2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        tvText2 = findViewById(R.id.tvText2)
        var subText:String = text.substringAfter('<')
        var subText2:String = subText.substringBefore('>')
        var subText3:String = text.substringAfter('>')
        var subText4:String = subText3.substringAfter('<')
        var subText5:String = subText4.substringBefore('>')
        var counter:Int
        for (n in 0 until text.length -1)
        {
            if(text.get(n)== '<') counter
        }
        //tvText?.setText(subText2)
        tvText?.setText(counter.toString())
        tvText2?.setText(subText5)
    }


}