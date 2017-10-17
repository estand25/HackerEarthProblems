package Data_Structures

/*
Data_Structures
Standley Eugene
10/16/2017
*/
fun main(args: Array<String>){
    var N = readLine()!!.toInt()
    var A = readLine()!!.replace(" ",",").split(",").map { it.trim() }
    var B = readLine()!!.replace(" ",",").split(",").map { it.trim() }

    for(i in 0..N-1){
        print("${A[i].toInt()+B[i].toInt()} ")
    }
}