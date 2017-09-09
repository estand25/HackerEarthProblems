package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var L = readLine()!!.toInt()
    var maxExpres: Int?
    var temp3 : MutableList<Int> = mutableListOf<Int>()

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

        for(n in 1..(temp1.size-1)){
            if(n == 1)
                if(temp2[0].toString() == "+")
                    temp = temp1[0] + temp1[1]
                else
                    temp = temp1[0] - temp1[1]
            else
                if(temp2[n-1].toString() == "+")
                    temp += temp1[n]
                else
                    temp -= temp1[n]
        }

        //println(temp)
        temp3.add(temp)
    }

    println(temp3.max())
}