package OctoberCircuits17

import java.math.BigInteger

/*
OctoberCircuits17
Standley Eugene
10/27/2017
*/

fun main(args: Array<String>){
    var n = readLine()!!.toInt()

    for(a in 0..(n-1)) {
        var a = readLine()!!.replace(" ", ",").split(",").map { it.trim() }

        var superBig = 1
        var nSuperBig = -1

        var result: String? = null

        if ((BigInteger.valueOf(superBig.toLong()) - BigInteger.valueOf(a[0].toLong())).toInt() > 0)
            result = "1"
        else if ((BigInteger.valueOf(superBig.toLong()) - BigInteger.valueOf(a[0].toLong())).toInt() == 0)
            result = "0"
        else
            result = "-1"

        if ((BigInteger.valueOf(nSuperBig.toLong()) - BigInteger.valueOf(a[1].toLong())).toInt() > 0)
            result += " 1"
        else if ((BigInteger.valueOf(nSuperBig.toLong()) - BigInteger.valueOf(a[1].toLong())).toInt() == 0)
            result += " 0"
        else
            result += " -1"

        println(result)
    }
}