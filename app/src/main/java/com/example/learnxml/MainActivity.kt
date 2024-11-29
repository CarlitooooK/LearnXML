package com.example.learnxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)
        window.statusBarColor = resources.getColor(R.color.colorStatusBar)
        Toast.makeText(this,"This is on Create",Toast.LENGTH_SHORT).show()

        val btnView1 = findViewById<Button>(R.id.viewLogin)
        val btnView2 = findViewById<Button>(R.id.viewSignUp)
        val btnView3 = findViewById<Button>(R.id.viewForgotPassword)
        val btnView4 = findViewById<Button>(R.id.viewResetPassword)

        // Listeners para cambiar de actividad
        btnView1.setOnClickListener {
            startActivity(Intent(this, Login_Activity::class.java))
        }

        btnView2.setOnClickListener {
            startActivity(Intent(this, Sign_Up_Activity::class.java))
        }

        btnView3.setOnClickListener {
            startActivity(Intent(this, forgot_password_Activity::class.java))
        }

        btnView4.setOnClickListener {
            startActivity(Intent(this, reset_password::class.java))
        }

    }

}





//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this,"This is on Resume",Toast.LENGTH_SHORT).show()
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this,"This is on Pause",Toast.LENGTH_SHORT).show()
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"This is on Destroy",Toast.LENGTH_SHORT).show()
//
//    }