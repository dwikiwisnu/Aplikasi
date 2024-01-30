package com.example.uas_pemogramanandroiddwiki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity() {
    private lateinit var mAngkaPertama : EditText
    private lateinit var mAngkaKedua : EditText
    private lateinit var mAngkaKetiga : EditText
    private lateinit var mAngkaKeempat : EditText
    private lateinit var mBtnPlus : Button
    private lateinit var mBtnMin : Button
    private lateinit var mBtnKali : Button
    private lateinit var mBtnBagi : Button
    private lateinit var mBtnPersen : Button
    private lateinit var mHasil : TextView
    private lateinit var mTotal : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        mAngkaPertama = findViewById(R.id.edtAngkaPertama)
        mAngkaKedua = findViewById(R.id.edtAngkaKedua)
        mAngkaKetiga = findViewById(R.id.edtAngkaKetiga)
        mAngkaKeempat = findViewById(R.id.edtAngkaKeEmpat)
        mHasil = findViewById(R.id.tvHasil)
        mBtnPlus = findViewById(R.id.btnPlus)
        mBtnMin = findViewById(R.id.btnMin)
        mBtnKali = findViewById(R.id.btnKali)
        mBtnBagi = findViewById(R.id.btnBagi)
        mBtnPersen = findViewById(R.id.btnPersen)
        mTotal = findViewById(R.id.tvTotal)


        mBtnPlus.setOnClickListener {

            val angka1 = mAngkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = mAngkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 + angka2

            mHasil.setText("Hasil : "  + hasil.toString())
        }
        mBtnMin.setOnClickListener {

            val angka1 = mAngkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = mAngkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 - angka2

            mHasil.setText("Hasil : "  + hasil.toString())
        }
        mBtnKali.setOnClickListener {

            val angka1 = mAngkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = mAngkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 * angka2

            mHasil.setText("Hasil : "  + hasil.toString())
        }
        mBtnBagi.setOnClickListener {

            val angka1 = mAngkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = mAngkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 / angka2

            mHasil.setText( "Hasil : " + hasil.toString())
        }
        mBtnPersen.setOnClickListener {

            val angka1 = mAngkaKetiga.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = mAngkaKeempat.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 * angka2
            val hasil2 = hasil/100

            mTotal.setText("Total yang harus dibayar : " + hasil2.toString())
        }
    }
}