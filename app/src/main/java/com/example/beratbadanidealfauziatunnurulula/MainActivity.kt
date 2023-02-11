package com.example.beratbadanidealfauziatunnurulula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputNama: EditText
    private lateinit var tb: EditText
    private lateinit var jkLakiLaki: RadioButton
    private lateinit var jkPerempuan: RadioButton
    private lateinit var hasil: TextView
    private lateinit var tambahData: Button
    private var tBadan: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputNama = findViewById(R.id.txt_Name)
        tb = findViewById(R.id.txt_tinggibadan)
        jkLakiLaki = findViewById(R.id.rb_lakilaki)
        jkPerempuan = findViewById(R.id.rb_perempuan)
        hasil = findViewById(R.id.hasil)
        tambahData = findViewById(R.id.btn_proses)

        tambahData.setOnClickListener {

            var tinggi = tb.text.toString().toInt()

            if (jkLakiLaki.isChecked) {
                tBadan = (tinggi - 100) - ((tinggi - 100) * 10/100)
                hasil.setText(tBadan.toString() + "kg")
            } else {
                tBadan = (tinggi - 100) - ((tinggi - 100) * 15/100)
                hasil.setText(tBadan.toString() + "kg")
            }
        }
    }
}