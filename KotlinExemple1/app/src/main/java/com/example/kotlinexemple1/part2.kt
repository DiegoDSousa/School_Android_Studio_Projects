package com.example.kotlinexemple1
data class utilizador(val id:Int,var nome:String)
fun main(){
    var content= listOf<String>("1","2","3","4","6")
    var caontent2="1,2,3,4,5,6"
    print(conta (caontent2))
    print(-1-2)


}
fun conta( content:String): Int {
    var li=content.split(",")
    return Integer.parseInt(li[4])/Integer.parseInt(li[1])
}
interface casa{
    fun aumentar(){}
    fun limpar(){print("limpando . . .")}
}

fun go(x:Int,y:Int):Int{
    return x+y
}