package Basic_Programming.Implementation

import java.math.BigInteger

/*
Basic_Programming.Implementation
Standley Eugene
9/23/2017
*/
fun main(args: Array<String>){
    var t = readLine()!!.toInt()
    var array = readLine()!!.replace(" ",",").split(",").map { it.trim() }
    var total = BigInteger("0")

    for(a in 0..(array.size-1)){
        total += BigInteger(array[a])
    }

    println(total)
}