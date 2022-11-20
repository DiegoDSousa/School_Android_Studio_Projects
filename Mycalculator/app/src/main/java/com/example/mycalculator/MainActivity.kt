package com.example.mycalculator

import android.graphics.PointF.length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.nio.file.Files.size

class MainActivity : AppCompatActivity() {
    private var resultado:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultado=findViewById(R.id.textView)

    }
    fun onDigit(view: View){
        resultado?.append((view as Button).text)
    }
    fun onclean(view: View){
        resultado?.text=""
    }
    fun equal(view:View){
        var view_content:String= resultado?.text.toString()
        resultado?.text=(findOperator(view_content)).toString()
    }

    private fun findOperator(contentstring:String): Double {
        var sum = 0.0
        if (contentstring.contains("+")) {
            var c = 0
            var content = contentstring.split("+")
            var limit = content.size
            while (c != limit) {
                sum += Integer.parseInt(content[c])
                c += 1
            }

        }
        if (contentstring.contains("-")) {
            var c = 0
            if (contentstring.startsWith("-")){
                var content = contentstring.substring(1).split("-")
                sum=((Integer.parseInt("-"+content[0]))-Integer.parseInt(content[1])).toDouble()
                return sum.toDouble()
            }
            var content = contentstring.split("-")
            sum=(Integer.parseInt(content[0])-Integer.parseInt(content[1])).toDouble()
        }
        if (contentstring.contains("/")) {
            var c = 0
            var content = contentstring.split("/")
            sum= Integer.parseInt(content[0]).toDouble()/ Integer.parseInt(content[1] ).toDouble()
            return sum.toDouble()
        }
        if (contentstring.contains("*")) {
            var c = 0
            var content = contentstring.split("*")
            sum=(Integer.parseInt(content[0])*Integer.parseInt(content[1])).toDouble()
        }

        return sum.toDouble()
    }
}








