package com.example.kotlinexemple1

fun main(){
    println("hello world")
    print("hello wolrd")
    var a="a"
    val b="TESTE"
    a="valor"
    print("testando mais um pouco "+a+"\n")
    var mystring:String="diego donovan silva sousa"
    println("String: ${mystring.length}")
    val nota=20
    when(nota){
        20 -> println("obteve a nota maxima")
        else-> println("nao obteve a nota maxima")
    }
    when(nota){
        in 0..9.9f.toInt() -> println("insuf")
        in 10..12.9f.toInt()->println("Insuf")
        in 13..16.9f.toInt()->println("Bom")
        in 17..20.0f.toInt()->println("Mbom")
    }

    val notas2=when(nota){
        1->"bom"
        in 3..2->"hehhe"
        else -> {"bem"}
    }
    print(notas2)

    var atendimendo = "quarta as 15"
}


