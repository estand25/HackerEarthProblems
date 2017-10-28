package Algorithms.Searching

/*
Algorithms.Searching
Standley Eugene
10/28/2017
*/

fun main(args: Array<String>){
    var t = readLine()!!.toInt()

    for (a in 0..(t-1)){
        var n = readLine()!!.toInt()

        var c = readLine()!!.replace(" ", ",").split(",").map { it.trim() }
        var l = readLine()!!.replace(" ", ",").split(",").map { it.trim() }

        var Ci: Int = 1
        var Li: Int = 1

        for (b in 0..(c.size - 1)) {
            Ci = Ci.times(c[b].toInt())
        }

        for (d in 0..(l.size - 1)) {
            Li = Li.times(l[d].toInt())
        }

        println(Ci + Li)
    }
}