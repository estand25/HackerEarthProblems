package OctoberCircuits17

/*
OctoberCircuits17
Standley Eugene
10/27/2017
*/
fun main(args: Array<String>){
    var input = readLine()!!.replace(" ",",").split(",").map { it.trim().toLong() }

    var n = input[0]
    var a = input[1]
    var mod = input[2]

    var count: MutableList<Int>  = mutableListOf<Int>()
    var result: Int? = null

    for(a1 in 0..(a-1)){
        count.add(n.toInt())
    }

    for(a2 in 0..(count.size-1)){
        if (result == null)
            result = count[a2]
        else
            result *= count[a2]
    }

    println(result!!.minus(1))
}