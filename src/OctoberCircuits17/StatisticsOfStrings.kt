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

    var Char : List<String> = listOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","q","r","s","t","u","v","w")

    var nChar : List<String> = Char.subList(0,n.toInt())

    var f: MutableList<String> = mutableListOf<String>()

    f.add(0,"")

    var initialResults = ""
    for(a1 in 0..(n-1)){
        initialResults+= nChar[0]
    }

    f.set(0,initialResults)

    println(initialResults)

}