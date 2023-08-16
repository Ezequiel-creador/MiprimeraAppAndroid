package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun compareValues(view: View) {
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val value1 = editText1.text.toString()
        val value2 = editText2.text.toString()

        val result = if (value1 == value2) {
            "Los valores son iguales"
        } else {
            "Los valores son diferentes"
        }

        resultTextView.text = result
    }




}