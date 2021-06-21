package com.example.signlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var btnnext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var spgender = findViewById<Spinner>(R.id.spgender)
        var btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            var intent = Intent(baseContext, login::class.java)
            startActivity(intent)


        }
        var gender = arrayOf("male", "female")
        var adapter = ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_item, gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter = adapter
    }

}


