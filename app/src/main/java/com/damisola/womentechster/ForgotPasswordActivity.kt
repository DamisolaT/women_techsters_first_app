package com.damisola.womentechster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)


          val alreadyHaveAccountBtn: Button = findViewById(R.id.accountButton)

          alreadyHaveAccountBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

         val sendBtn: Button = findViewById(R.id.sendButton)
          val textInput: TextInputLayout = findViewById(R.id.textInputLayout)
        sendBtn.setOnClickListener {
            val userEmailEntered: String = textInput.editText?.text.toString()
            var message = "";
            if(userEmailEntered.isEmpty()){
                message ="You need to enter an email address"
            }else{
                message = " A recovery email has been sent to $userEmailEntered"
            }
            Snackbar.make(findViewById(R.id.layout), " A recovery email have been sent to $userEmailEntered", Snackbar.LENGTH_LONG).show()
        }



    }
}