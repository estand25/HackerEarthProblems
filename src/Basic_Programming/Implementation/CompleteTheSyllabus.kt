package Basic_Programming.Implementation

import com.sun.xml.internal.fastinfoset.util.StringArray

/*
Basic_Programming.Implementation
Standley Eugene
9/23/2017
*/
fun main(args: Array<String>){
    var t = readLine()!!.toInt()
    var array  = arrayOf("MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY")
    var xy : MutableList<String> = mutableListOf<String>()

    for(a in 0..(t -1)){
        var k = readLine()!!.toInt()
        var A = readLine()!!.replace(" ",",").split(",").map { it.trim() }
        var k_ = k

        if(k > 9){
            k_ = k_.toString().substring(0,1).toInt()
        }

        var c = 0
        while(c >= (array.size-1)){
            if(A[c] == "1")
                xy.add(array[k_-1])
            else
                xy.add("--")
            c++
        }

        if(k > 7) {
//            println(k)
            println(array[6])
        }
        else {
//            println(k)
            println(array[k - 1])
        }
        //println(array)
    }
}