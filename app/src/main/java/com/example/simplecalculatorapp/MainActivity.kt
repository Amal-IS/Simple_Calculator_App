package com.example.simplecalculatorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display: TextView
    lateinit var edit_first: EditText
    lateinit var edit_second: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var div: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display = findViewById(R.id.Text_View)
        edit_first = findViewById(R.id.first_number)
        edit_second = findViewById(R.id.second_number)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.subs)
        div = findViewById(R.id.divide)


        add.setOnClickListener {

            val res1 = edit_first.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            addition(res1, res2)
        }
       sub.setOnClickListener {
           val res1 = edit_first.text.toString().toInt()
           val res2 = edit_second.text.toString().toInt()
            subtraction(res1, res2)
        }
        div.setOnClickListener {
            val res1 = edit_first.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            division(res1, res2)
        }
    }


    private fun division(res1: Int, res2: Int) {
        val result = res1 / res2
        display.text=result.toString()
    }

    private fun subtraction(res1: Int, res2: Int) {
        val result = res1 - res2
        display.text=result.toString()
    }

    private fun addition(res1: Int, res2: Int) {
        val result = res1 + res2
        display.text=result.toString()
    }

}