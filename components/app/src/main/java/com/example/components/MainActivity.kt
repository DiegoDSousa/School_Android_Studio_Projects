package com.example.components

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var vermelho:RadioButton
        lateinit var verde:RadioButton
        lateinit var amarelo:RadioButton
        lateinit var ok:Button
        lateinit var layout:ConstraintLayout
        lateinit var gourradious: RadioGroup

        vermelho=findViewById(R.id.radioButton)
        amarelo=findViewById(R.id.radioButton2)
        verde=findViewById(R.id.radioButton3)
        ok=findViewById(R.id.button2)
        layout=findViewById(R.id.layoutID)
        gourradious=findViewById(R.id.radioGroup)

        ok.setOnClickListener{
            if(vermelho.isChecked){
                layout.setBackgroundColor(Color.rgb(250,0,63))}
            else if(amarelo.isChecked){
                layout.setBackgroundColor(Color.rgb(255, 207, 0))
            }
            else if(verde.isChecked){
                layout.setBackgroundColor(Color.rgb(107, 241, 120))
            }else{
                layout.setBackgroundColor(Color.rgb(255,255,255))
            }
        }




        /*
        * toas
        * message dialog
        * */


    }
}