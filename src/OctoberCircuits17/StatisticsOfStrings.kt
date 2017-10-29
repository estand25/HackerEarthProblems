package OctoberCircuits17

import java.math.BigInteger

/*
OctoberCircuits17
Standley Eugene
10/27/2017
*/
fun main(args: Array<String>){
    var n = BigInteger.valueOf(readLine()!!.toLong())

    //BigInteger.valueOf(n)
//    for(a in 0..(n-1)) {
        var a = readLine()!!.replace(" ", ",").split(",").map { it.trim() }

        var superBig = 1
        var nSuperBig = -1

        var result: String? = null

        if (superBig - (a[0].toLong()).toInt() > 0)
            result = "1"
        else if (superBig - (a[0].toLong()).toInt() == 0)
            result = "0"
        else
            result = "-1"

        result += " "

        if (nSuperBig - (a[0].toLong()).toInt() > 0)
            result += "1"
        else if (nSuperBig - (a[0].toLong()).toInt() == 0)
            result += "0"
        else
            result += "-1"

        println(result)
//    }
}