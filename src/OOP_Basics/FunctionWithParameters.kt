package OOP_Basics

/*
OOP_Basics - Function with Parameters
Standley Eugene
10/16/2017
*/
fun main(args: Array<String>){
    //println("hello")
    add(2,3)
    subtract(3,1)
    subtract(3,1,1)
}

fun add(num1: Int,num2: Int){
    var sum = num1 + num2
    println("Sum is $sum")
}

fun subtract(num1: Int,num2: Int){
    var res = num1 - num2
    println("Result is $res")
}

fun subtract(num1: Int,num2: Int, num3:Int){
    var res = num1 - num2 - 1
    println("Result is $res")
}