package android.example.lesson5_intent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var tvMessage = findViewById<TextView>(R.id.tvMessage)
        var i = intent
        if (i != null)tvMessage.setText(i.getCharSequenceExtra("salut"))
    }
    fun backButton(view:View)
    {
        val intent2 = Intent(this, MainActivity::class.java)
        startActivity(intent2)
    }
}