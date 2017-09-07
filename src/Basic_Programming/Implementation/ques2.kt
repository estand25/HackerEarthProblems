package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var nxy = readLine()!!.replace(" ", ",").split(",").map { it.trim()}
    var b = readLine()!!.replace(" ", ",").split(",").map{ it.trim()}

    var n = nxy[0].toInt()
    var x = nxy[1].toInt()
    var y = nxy[2].toInt()
    var xy : MutableList<String> = mutableListOf<String>()

    for(aa in x..y) {
        xy.add(aa.toString())
    }

    if(b.containsAll(xy))
        println("YES")
    else
        println("NO")
}