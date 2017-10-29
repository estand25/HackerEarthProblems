package OctoberCircuits17

import java.math.BigInteger

/*
OctoberCircuits17
Standley Eugene
10/27/2017
*/
fun main(args: Array<String>){
    var n = BigInteger.valueOf(readLine()!!.toLong())

    var a = readLine()!!.replace(" ", ",").split(",").map { it.trim() }

    var result: String? = null

    if ((n.toLong() + a[0].toLong()).toInt() > 0)
        result = "1"
    else if ((n.toLong() + a[0].toLong()).toInt() == 0)
        result = "0"
    else
        result = "-1"

    result += " "

    if ((n.toLong() + a[0].toLong()).toInt() < 0)
        result += "-1"
    else if ((n.toLong() + a[0].toLong()).toInt() == 0)
        result += "0"
    else
        result += "1"

    println(result)
}