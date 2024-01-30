package com.example.uas_pemogramanandroiddwiki

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mUsername: EditText
    private lateinit var mPassword: EditText
    private lateinit var mBtn: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mUsername = findViewById(R.id.edtUsername)
        mPassword = findViewById(R.id.edtPassword)
        mBtn = findViewById(R.id.btnLogin)

        mBtn.setOnClickListener {

            if (mUsername.text.toString().equals("Admin") && mPassword.text.toString()
                    .equals("123")
            ) {
                //Login Sukses

                val Intent = Intent(this, Profil::class.java)
                startActivity(Intent)

            } else {
                //Login Gagal

                Toast.makeText(this, "Username or Password Salah", Toast.LENGTH_SHORT).show()
            }

        }

    }
}