package android.example.lesson5_intent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startSecondActivity(view:View)
    {
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("salut", "Привет с майн активити")
        }
        startActivity(intent)
    }
}