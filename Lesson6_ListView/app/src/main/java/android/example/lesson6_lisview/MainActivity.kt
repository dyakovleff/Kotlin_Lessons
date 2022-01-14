package android.example.lesson6_lisview

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameList = ArrayList<String>()
        nameList.add("Серега")
        nameList.add("Леха")
        nameList.add("Егор")
        nameList.add("Семен")
        nameList.add("Денис")
        nameList.add("Степан")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nameList)
        listView.adapter = adapter
    }
}