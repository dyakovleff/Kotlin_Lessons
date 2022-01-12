package android.example.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number1:Int = 5
    private var number2:Int = 6
    private var text:String = "В <магазине> осталось 123 яблока а может и <больше кто знает> всем привет <как> у вас дела <надеюсь> не <болеете>"
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
        var subText6:String = text.substring(3,9)
        var counter:Int = 0


        for (n in text.indices)
        {
            if(text.get(n)== '<') counter++
        }
        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)
        var startPcounter:Int =0
        var endPcounter:Int =0
        for (n in text.indices)
        {
            if(text.get(n)== '<')
            {
                startPosition[startPcounter] = n
                startPcounter++
            }

            if(text.get(n)== '>')
            {
                endPosition[endPcounter] = n
                endPcounter++
            }
        }
        var textFoundAray = Array(counter){""}
        for (n in startPosition.indices)
        {
            textFoundAray[n] = text.substring(startPosition[n] + 1,endPosition[n])
            Log.d("MyLog", "Text from n: " +textFoundAray[n])
        }

        tvText?.setText(counter.toString())
        tvText2?.setText(subText5)
    }


}