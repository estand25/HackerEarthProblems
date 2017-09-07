package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/6/2017
*/
fun main(args: Array<String>){
    var t = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    var numberCount: Int = 0
    var xy : MutableList<Boolean> = mutableListOf<Boolean>()

    for(aa in 1..t) {
        var s = readLine()!!.toCharArray()
        for (a in 0..(c-1)) {
            var isNumber = false

            if (!s[a].isLetter())
                isNumber = true

            if(s[a].isLetter() && isNumber)
                numberCount++
//            else
//                isNumber = false
            //if (!s[a].isLetter()) {
            println(s[a] + " " + isNumber + " " + numberCount)

            xy.add(isNumber)

            //if(xy.contains(false))

            //}
        }
        println(numberCount)
    }
}