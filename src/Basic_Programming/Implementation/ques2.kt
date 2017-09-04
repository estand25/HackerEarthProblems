package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var nxy = readLine()!!.replace(" ", ",").split(",").map { it.trim()}

    var n = nxy[0].toInt()
    var x = nxy[1].toInt()
    var y = nxy[2].toInt()
    var xy : MutableList<String> = mutableListOf<String>()

    for(aa in x..(y-1)) {
        xy.add(aa.toString())
    }

    for(a in 0..(y-1)){
        var b = readLine()!!.split(",").map{ it.trim()}

    }

}