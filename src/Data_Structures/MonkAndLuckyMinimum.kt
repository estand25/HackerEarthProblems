package Data_Structures

/*
Data_Structures
Standley Eugene
10/21/2017
*/

//import java.util.*

fun main(args: Array<String>){
    var T = readLine()!!.toInt()
//    val reader = Scanner(System.`in`)
//    var T = reader.nextInt()

    for(i in 0..(T-1)){
        var N = readLine()!!.toInt()
        var Ai = readLine()!!.replace(" ",",").split(",").map { it.trim().toInt() }

//        var N = reader.nextInt()
//        var Ai = reader.next()!!.replace(" ", ",").map { it.toString() }

        var lowest = Ai.min()//!!.single()
        //var lenght: List<Int> = Ai.map { x -> x.count() } //.distinct()
        //var lenght: List<String> = Ai.filter { x -> x.count().equals(7) }.sorted()
        //var countLowestList: List<String> = Ai.filter { x -> x.equals(lowest.toString()) }
        //var countLowest = Ai.filter { x -> x.equals(lowest.toString()) }.count()
        var countLowest = Ai.filter { x -> x.equals(lowest) }.count()
        println(lowest)
        //println(lenght)
        //println(countLowestList)
        println(countLowest)

        if(countLowest % 2 == 0)
            println("Unlucky")
        else
            println("Lucky")
    }
}