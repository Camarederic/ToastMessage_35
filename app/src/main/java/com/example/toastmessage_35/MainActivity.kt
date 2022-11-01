package com.example.toastmessage_35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener {
            Toast.makeText(this, "Hi, I'm a Toast message!", Toast.LENGTH_LONG).show()
        }
    }
}