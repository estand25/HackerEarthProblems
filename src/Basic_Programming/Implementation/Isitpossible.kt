package Basic_Programming.Implementation

import java.math.BigInteger
/*
Basic_Programming.Implementation
Standley Eugene
9/9/2017
Work in Progress
*/
fun main(args: Array<String>){
    var t = readLine()!!.toString()

    var bigT = BigInteger(t)

    for(a in 0..(bigT-BigInteger.ONE).toInt()){
        var b = readLine()!!.toString()

        var input = BigInteger.valueOf(b.toLong())

        if(input.divide(BigInteger("2")).equals(0))
            println("YES")
        else
            println("NO")
    }
}