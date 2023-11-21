package com.damisola.womentechster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateNewAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_account)

        var sendToForgot: Button = findViewById(R.id.signUpButton)
        sendToForgot.setOnClickListener{
            val i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }

    }
}