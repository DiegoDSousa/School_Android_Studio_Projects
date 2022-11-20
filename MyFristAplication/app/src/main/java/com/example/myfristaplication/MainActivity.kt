package com.example.myfristaplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Mysecret=findViewById<TextView>(R.id.textView5)

        val tvMyTextView=findViewById<TextView>(R.id.textView4)
        tvMyTextView.text="0"
        val myButton=findViewById<Button>(R.id.button)
        val myButton2=findViewById<Button>(R.id.button2)
        val myButton3=findViewById<Button>(R.id.button3)
        var content=0
        myButton.setOnClickListener {
            content+=1
            tvMyTextView.text= content.toString()
            if(content==10){
                Mysecret.text="hehe boy"
            }else{
                Mysecret.text=""
        }

        }
        myButton3.setOnClickListener {
            content-=1
            tvMyTextView.text= content.toString()
            if(content==10){
                Mysecret.text="hehe boy"
            }else{
                Mysecret.text=""
            }

        myButton2.setOnClickListener{
            content=0
            tvMyTextView.text= content.toString()
            Mysecret.text=""
        }




    }
}}