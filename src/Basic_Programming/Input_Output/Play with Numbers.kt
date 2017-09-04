package Basic_Programming.Input_Output

/*
Basic_Programming.Input_Output
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var firstLine = readLine()!!.toString().replace(" ",",").split(",").map{it.trim()}

    var N = firstLine[0].toInt()
    var Q = firstLine[1].toInt()

    var secondLine = readLine()!!.toString()

    for(a in 0..(Q-1)){
        var qline = readLine()!!.toString().split(" ").map { it.trim() }

        var L = qline[0].toInt()
        var R = qline[1].toInt()

        println("${(L+R)/2}")
    }
}