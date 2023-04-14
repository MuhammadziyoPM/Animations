package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var editText3 = findViewById<Button>(R.id.sign_in)
        editText3.setOnClickListener {
            val intent = Intent(this@SignUpActivity , SignInActivity ::class.java)
            startActivity(intent)
        }
        var textView = findViewById<TextView>(R.id.sign_up)
        textView.setOnClickListener {
            val intent2 = Intent(this@SignUpActivity , SignInActivity ::class.java)
            startActivity(intent2)
        }
    }

}