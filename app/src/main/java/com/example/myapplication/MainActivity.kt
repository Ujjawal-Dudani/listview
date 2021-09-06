package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val country = arrayOf(
        "America",
        "India",
        "Pakistan",
        "Australia",
        "England",
        "Newyork"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayadapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,country)
        list.adapter = arrayadapter
        list.setOnItemClickListener{
                adapterview, view, position, Int ->
            Toast.makeText(this,""+position,Toast.LENGTH_SHORT).show()
        }

        }
}