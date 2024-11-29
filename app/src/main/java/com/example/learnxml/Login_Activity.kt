package com.example.learnxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = resources.getColor(R.color.colorStatusBar)
    }
}
