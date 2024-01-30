package com.example.uas_pemogramanandroiddwiki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profil : AppCompatActivity() {

    private lateinit var bNext: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        bNext = findViewById(R.id.btnNext)

        bNext.setOnClickListener {

            val mActivity = Intent(this, MenuActivity::class.java)
            startActivity(mActivity)
        }
    }
}