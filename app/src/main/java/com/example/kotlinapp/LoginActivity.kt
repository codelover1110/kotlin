package com.example.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        login_button_signin.setOnClickListener {
            val email = login_text_edit_email.text.toString()
            val password = login_text_edit_password.text.toString()

            Log.d("Login", "ok")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener()
        }

        login_button_signup.setOnClickListener {
            finish()
        }
    }
}