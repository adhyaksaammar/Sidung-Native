package com.example.projectsidung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_tata_cara.*

class TataCara : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tata_cara)

        val context = this

        btnBackMain3.setOnClickListener {
            var intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
