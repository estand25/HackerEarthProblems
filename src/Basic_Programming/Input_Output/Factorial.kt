package Basic_Programming.Input_Output

/*
Basic_Programming.Input_Output
Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var n = readLine()!!.toInt()
    var output: String? = null

    for(i in 1..n) {
        if (output.isNullOrEmpty())
            output = i.toString()
        else
            output = (output!!.toInt() * i).toString()
    }
    println(output)
}