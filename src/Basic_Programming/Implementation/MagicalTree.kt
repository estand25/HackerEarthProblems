package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var L = readLine()!!.toInt()
    var maxExpres: Int?

    for(i in 0..(L-1)){
        var input = readLine()!!.toCharArray()
        var temp: Int = 0
        var temp1 : MutableList<Int> = mutableListOf<Int>()
        var temp2 : MutableList<String> = mutableListOf<String>()

        for (j in 0..(input.size-1)){
            if(temp == 0)
                if(input[j].isLetterOrDigit())
                    temp1.add(input[j].toString().toInt())
                else
                    temp2.add(input[j].toString())
        }

//        for(k in 0..(temp1.size-1))
//            print(temp1[k].toString())
//
//        println("")
//        println(temp1.size)
//        println("")
//
//        for(m in 0..(temp2.size-1))
//            print(temp2[m].toString())
//
//        println("")
//        println(temp2.size)
//        println("")

        for(n in 1..(temp1.size-1)){
            if(n == 1)
                if(temp2[0].toString() == "+") {
                    temp = temp1[0] + temp1[1]

//                    println(temp.toString() + " = " + temp1[0].toString().toInt() + " + " + temp1[1].toString().toInt())
                }
                else {
                    temp = temp1[0] - temp1[1]
//                    println(temp.toString() + " = " + temp1[0].toString().toInt() + " - " + temp1[1].toString().toInt())
                }
            else
                if(temp2[n-1].toString() == "+") {
                    temp += temp1[n]
//                    println(temp.toString() + " += " + temp1[n].toString().toInt())
                }
                else {
                    temp -= temp1[n]
//                    println(temp.toString() + " -= " + temp1[n].toString().toInt())
                }
        }

        println("")
        println(temp)
        println("")
    }
}