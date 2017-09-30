package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/30/2017
*/
fun main (args: Array<String>){
    var n = readLine()!!.toString()
    var nArray = readLine()!!.replace(" ",",").split(",").map{it.trim()}
    var xy : MutableList<String> = mutableListOf<String>()

    for(a in 1..nArray.size){
        xy.add(a.toString())
    }

    if(xy.containsAll(nArray) && !xy.removeAll(nArray))
        println("YES")
    else
        println("NO")
}