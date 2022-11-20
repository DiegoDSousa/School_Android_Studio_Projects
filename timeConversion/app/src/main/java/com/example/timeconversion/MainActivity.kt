package com.example.timeconversion

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import java.util.*


class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Calendar = findViewById<CalendarView>(R.id.calendarView)
        val FirstDate = findViewById<TextView>(R.id.FristDate)
        val LastDate = findViewById<TextView>(R.id.LastDate)
        val SelectButton = findViewById<Button>(R.id.selectButton)
        val Select = findViewById<TextView>(R.id.Select)
        val Result = findViewById<TextView>(R.id.Result)
        var First_date=""
        var Last_date=""
        var year:Int=0
        var month:Int=0
        var day:Int=0

        FirstDate.text=""
        Calendar.setOnDateChangeListener{ calendarView: CalendarView, i: Int, i1: Int, i2: Int ->
            year=i
            month=i1+1
            day=i2}

        SelectButton.setOnClickListener{
            if(FirstDate.text.isEmpty()){
                First_date=day.toString()+"/"+month.toString()+"/"+year.toString()
                FirstDate.text=First_date

            }else{
                Last_date=day.toString()+"/"+month.toString()+"/"+year.toString()
                LastDate.text=Last_date

            }




        }
    }
}





