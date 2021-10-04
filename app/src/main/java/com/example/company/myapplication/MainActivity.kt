package com.example.company.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var filepath = findViewById<EditText>(R.id.filepath)
        var result = findViewById<TextView>(R.id.result)




        perform.setOnClickListener {

            try {

                val file = File(Environment.getExternalStorageDirectory(), filepath.text.toString())
                result.text = file.readText()

            } catch(e:Exception) {

            }

        }

      }
}
