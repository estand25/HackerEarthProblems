package Data_Structures

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val sN = readLine()!!.split(" ")
    val q = readLine()!!.toInt()
    val qList = mutableListOf<String>()

    for (i in 1..q){
        val qSub = readLine()
        qList.add(qSub!!)
    }

    for(j in qList){
        if(!sN.contains(j) )
            println("NOT PRESENT")
        else
            println( sN.filter { it == j}.size )
    }
}