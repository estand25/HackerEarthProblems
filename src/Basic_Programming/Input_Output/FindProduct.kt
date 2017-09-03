package Basic_Programming.Input_Output/*
--UnSolved
Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var n = readLine()!!.toInt()
    var a = readLine()!!.toString()

    var answer: Int = 1
    var m = 1000000007

    var aa = a.replace(" ",",").split(",").map{it.trim()}

//    aa.forEach{
//        var a = it.toInt()
//        println(a)
//        //println(answer)
//        answer = (answer * a) % m
//    }
//    println(answer)
//    println(aa.size)
//
    for (an in 0..(aa.size-1)){
        println(aa[an])
        answer = (answer * aa[an].toString().toInt()) % m.toInt()//1000000007
    }
    println(answer)
}