package com.example.datatominuts


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.util.*


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnselect:Button=findViewById(R.id.button)
        btnselect.setOnClickListener{
            val calendario= Calendar.getInstance()
            val ano=calendario.get(Calendar.YEAR)
            val mes=calendario.get(Calendar.YEAR)
            val dia=calendario.get(Calendar.YEAR)


            //date picker dialog
            //simpledateformat
            //tempo das duas datas subtrair e colocar no view
            Toast.makeText(this,"hehe boy",Toast.LENGTH_LONG).show()

        }
    }}
