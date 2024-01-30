package com.example.uas_pemogramanandroiddwiki

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {

    private lateinit var mCvCalculator : CardView
    private lateinit var mNotes : CardView

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        mCvCalculator = findViewById(R.id.cvCalculator)
        mNotes = findViewById(R.id.cvNotes)

        mCvCalculator.setOnClickListener {

            val i = Intent(this,Calculator::class.java)
            startActivity(i)

        }


        mNotes.setOnClickListener {

            val myData = Intent(this,RoomActivity::class.java)
            startActivity(myData)

        }

    }
}