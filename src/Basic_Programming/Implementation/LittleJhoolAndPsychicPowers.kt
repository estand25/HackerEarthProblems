package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/21/2017
*/
fun main(args: Array<String>){
    var zero = "000000"
    var one = "111111"

    var input = readLine()!!.toString()

    if(input.contains(zero) || input.contains(one))
        println("Sorry, sorry!")
    else
        println("Good luck!")
}