package com.damisola.womentechster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar



class LoginActivity : AppCompatActivity() {


    private fun navigateUpToPage() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

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

        // Week 6 Assessment Task
                    val loginBtn: Button = findViewById(R.id.loginbutton)
                    val usernameTxt : EditText = findViewById(R.id.username)
                        val passwordTxt : EditText = findViewById(R.id.password)

                      loginBtn.setOnClickListener {
                     val userNameTxt: String= usernameTxt.text.toString()
                     val passWordTxt: String = passwordTxt.text.toString()
                         var message: String= ""

                         if(userNameTxt != "Damisola"){
                             message = "wrong username"
                         }else if(passWordTxt != "dami"){
                             message ="Inavalid Password"

                         }

                  if (message.isNotEmpty()){
                      Snackbar.make(
                          findViewById(R.id.layout),
                          message, Snackbar.LENGTH_LONG
                      ).show()
                  }else{
                      navigateUpToPage()
                  }

             }

    }
}