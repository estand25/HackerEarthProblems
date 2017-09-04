package Basic_Programming.Input_Output

/*
Basic_Programming.Input_Output
Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var input = readLine()!!.replace(" ", ",").split(",").map { it.trim() }

    var l = input[0].toInt()
    var r = input[1].toInt()
    var k = input[2].toInt()

    var count: Int = 0

    for (c in l..r)
        if(c%k == 0)
            count++

    println(count)
}