package com.damisola.womentechster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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

                   //val loginButton: Button = findViewById(R.id.loginbutton)
                  // loginButton.setOnClickListener{
                  //    val intent = Intent(this,HomeActivity::class.java)
                   //   startActivity(intent)
                 // }
                val btnValidate: Button = findViewById(R.id.loginbutton)

              val usernameEdit : EditText = findViewById(R.id.username)
              val passwordEdit : EditText = findViewById(R.id.password)

             btnValidate.setOnClickListener {
                  val userNameEntered: String= usernameEdit.text.toString()
                  val passWordEntered: String = passwordEdit.text.toString()

                   if (userNameEntered.isEmpty()){
                     usernameEdit.error = "Username Required"
                     return@setOnClickListener
                 }else if (passWordEntered.isEmpty()){
                     passwordEdit.error = "Password Require"
                     return@setOnClickListener
                 }else{
                     Toast.makeText(this, " Complete Login",Toast.LENGTH_SHORT).show()
                 }

             }

    }
}