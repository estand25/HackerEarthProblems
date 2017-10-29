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

//    var superBig = 1+n.toLong()
//    var nSuperBig = -1+n.toLong()

    var result: String? = null

    if ((a[0].toLong()+n.toLong()).toInt() > 0)
        result = "1"//superBig.toInt() -
    else if ((a[0].toLong()+n.toLong()).toInt() == 0)
        result = "0"//superBig.toInt() -
    else if ((a[0].toLong()+n.toLong()).toInt() < 0)
        result = "-1"//superBig.toInt() -

    result += " "

    if ((-a[0].toLong()+n.toLong()).toInt() > 0)
        result += "1"//nSuperBig.toInt() -
    else if ((-a[0].toLong()+n.toLong()).toInt() == 0)
        result += "0"//nSuperBig.toInt() -
    else if ((-a[0].toLong()+n.toLong()).toInt() < 0)
        result += "-1"//nSuperBig.toInt() -

                println(result)
}