package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var L = readLine()!!.toInt()
    var maxExpres: Int?

    for(i in 0..L){
        var input = readLine()!!.toCharArray()
        var temp: Int?
        var temp1 : String? = ""
        var temp2 : String? = ""

        for (j in 0..(input.size-1)){
            if (input[j].isDigit()){
                //temp = input[j].toInt()
                temp1 = temp1 + input[j]
            }else{
                temp2 = temp2 + input[j]
            }
        }
        println(temp1)
        println(temp2)
    }
}