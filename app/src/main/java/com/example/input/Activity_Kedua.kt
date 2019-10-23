package com.example.input

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*

class Activity_Kedua : AppCompatActivity() {

    var ket:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val intent = intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nilai = intent.getStringExtra("nilai")

        val nilai_akhir:Int = (intent.getStringExtra("nilai").toInt())

        if(nilai_akhir >= 80 && nilai_akhir <= 100){
            ket = "A"
        }else if(nilai_akhir >= 60 && nilai_akhir < 80){
            ket = "B"
        }else if(nilai_akhir >= 40 && nilai_akhir < 60){
            ket = "C"
        }else if(nilai_akhir >= 20 && nilai_akhir < 40){
            ket = "D"
        }else if(nilai_akhir >= 0 && nilai_akhir < 20){
            ket = "E"
        }

        val hasil_edit = findViewById<TextView>(R.id.hasil_edit)

        hasil_edit.text = "Nim              : "+nim+"\nNama           : "+nama+"\nNilai              : "+nilai+"\nKeterangan  : "+ket

        back_button.setOnClickListener {

            val intent1 = Intent (this@Activity_Kedua, MainActivity::class.java)
            startActivity(intent1)
        }


    }
}
