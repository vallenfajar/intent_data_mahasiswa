package com.example.input

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimEt =  findViewById<EditText>(R.id.edit_nim)
        val namaEt = findViewById<EditText>(R.id.edit_nama)
        val nilaiEt = findViewById<EditText>(R.id.edit_nilai)
        val prosesBtn = findViewById<Button>(R.id.button_proses)

        prosesBtn.setOnClickListener {
            val nim = nimEt.text.toString()
            val nama = namaEt.text.toString()
            val nilai = nilaiEt.text.toString()

            val intent = Intent (this@MainActivity, Activity_Kedua::class.java)
            intent.putExtra("nim", nim)
            intent.putExtra("nama", nama)
            intent.putExtra("nilai", nilai)
            startActivity(intent)
        }
    }
}
