package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/9/2017
*/
fun main(args: Array<String>){
    var t = readLine()!!.toInt()

    for(a in 0..(t-1)){
        var b = readLine()!!.toCharArray()

        if((b.size % 2) == 0)
            println("YES")
        else
            println("NO")
    }
}