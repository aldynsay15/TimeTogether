package com.example.timetogether

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import domain.model.Registration


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonToReg: Button= findViewById(R.id.button_reg)
        buttonToReg.setOnClickListener{
            val intent =  Intent(this, Registration::class.java)
            startActivity(intent)

        }



    }
}