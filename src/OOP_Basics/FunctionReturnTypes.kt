package OOP_Basics

/*
OOP_Basics
Standley Eugene
10/16/2017
*/
fun main(args: Array<String>){
    println(multiply(2,3))

    var result = multiply(2,3)

    var finalResult = result/divided(2)

    println("Result: $finalResult")

    println("My name is: ${getName("Standley Eugene")}")

    println("My digit is: ${getdigit(1987.1)}")

    //println("My float is: ${getFloat()}")
}

fun multiply(num1: Int, num2: Int) : Int{
    //var result = num1 * num2
    return num1 * num2
}

fun divided(num1:Int) : Int{
    return num1
}

fun getName(name:String) : String{
    return name
}

fun getdigit(digit:Double) : Double{
    return digit
}

fun getFloat(float: Float) : Float{
    return float
}
fun getTorF(result:Boolean) : Boolean {
    return result
}