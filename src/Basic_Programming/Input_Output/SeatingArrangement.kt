package Basic_Programming.Input_Output

/*
Basic_Programming.Input_Output
Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var t = readLine()!!.toInt()
//    var output: String? = ""

    for (n in 0..(t-1)){
        var n = readLine()!!.toInt()

        var out: String? = ""
//        println("${n%12}")
//        var o = n%12
//        println("${n/12}")
//        var i = (n/12)-1
//        println("${(n/12)-1}")
//        //println("${(12 * o)}")
//        println("${(12 * i)+o}")

        out += when {
            (n%12) == 0 -> (((n/12)-1)*12)+1
            (n%12) == 1 -> if((n/12) == 0) "12" else ((12*(n/12)) + 12)
            (n%12) == 2 -> if((n/12) == 0) "11" else ((12*(n/12)) + 11)
            (n%12) == 3 -> if((n/12) == 0) "10" else ((12*(n/12)) + 10)
            (n%12) == 4 -> if((n/12) == 0) "9" else ((12*(n/12)) + 9)
            (n%12) == 5 -> if((n/12) == 0) "8" else ((12*(n/12)) + 8)
            (n%12) == 6 -> if((n/12) == 0) "7" else ((12*(n/12)) + 7)
            (n%12) == 7 -> if((n/12) == 0) "6" else ((12*(n/12)) + 6)
            (n%12) == 8 -> if((n/12) == 0) "5" else ((12*(n/12)) + 5)
            (n%12) == 9 -> if((n/12) == 0) "4" else ((12*(n/12)) + 4)
            (n%12) == 10 -> if((n/12) == 0) "3" else ((12*(n/12)) + 3)
            (n%12) == 11 -> if((n/12) == 0) "2" else ((12*(n/12)) + 2)
            (n%12) == 12 -> if((n/12) == 0) "1" else ((12*(n/12)) + 1)
            else -> ""
        }

        out += when{
            (n%12) == 7 || (n%12) == 12 || (n%12) == 6 || (n%12) == 1 || (n%12) == 0 -> " WS"
            (n%12) == 8 || (n%12) == 11 || (n%12) == 5 || (n%12) == 2 -> " MS"
            (n%12) == 9 || (n%12) == 4 || (n%12) == 10 || (n%12) == 3 -> " AS"
            else -> ""
        }

        println(out)
    }
}