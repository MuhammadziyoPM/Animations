package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initViews()
    }

    private fun initViews() {
        var editText = findViewById<Button>(R.id.sign_in)
        editText.setOnClickListener {
            val intent = Intent(this@SignInActivity , SignUpActivity ::class.java)
            startActivity(intent)
        }
        var textView = findViewById<TextView>(R.id.sign_up)
        textView.setOnClickListener {
            val intent2 = Intent(this@SignInActivity , SignUpActivity ::class.java)
            startActivity(intent2)
        }
    }
}