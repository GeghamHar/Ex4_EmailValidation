package com.example.ex4_emailvalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val email = findViewById<EditText>(R.id.edit_email)
        val pass = findViewById<EditText>(R.id.pass_input)

        button.setOnClickListener {

            val validEmail = email.text.toString().trim()
            val validPassword = pass.text.toString().trim()
            val emailPattern =  "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
            val passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"


            if(validPassword.matches(passwordPattern.toRegex())){
                Toast.makeText(this,"validPassword",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"InvalidPassword",Toast.LENGTH_SHORT).show()
            }

            if (validEmail.matches(emailPattern.toRegex()))
            {
                Toast.makeText(this,"valid email address",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Invalid email address", Toast.LENGTH_SHORT).show()
            }
        }

    }
}

