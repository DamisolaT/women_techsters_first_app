package com.damisola.womentechster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

               val createNewButton:Button = findViewById(R.id.createNewAccount)

               createNewButton.setOnClickListener {
               val i = Intent(this, CreateNewAccountActivity::class.java)
               startActivity(i)
          }

                val forgotPasswordBtn: Button = findViewById(R.id.forgottenPassword)

                forgotPasswordBtn.setOnClickListener{
                 val intent = Intent(this,ForgotPasswordActivity::class.java)
                 startActivity(intent)
             }

               val loginButton: Button = findViewById(R.id.loginbutton)
                  loginButton.setOnClickListener{
                      val intent = Intent(this,LoginActivity::class.java)
                      startActivity(intent)
                  }

    }
}