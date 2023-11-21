package com.damisola.womentechster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

          var createNewButton:Button = findViewById(R.id.button)

          createNewButton.setOnClickListener{
            val i = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(i)
        }
    }
}