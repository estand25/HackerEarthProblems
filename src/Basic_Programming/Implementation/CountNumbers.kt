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
    var num : MutableList<Int> = mutableListOf<Int>()
    var num2 : MutableList<Int> = mutableListOf<Int>()

    for(aa in 1..t) {
        var s = readLine()!!.toCharArray()
        var t = s
        var prevIsNumber = false

        for (a in 0..(c-1)) {
            var isNumber = false

            if (!s[a].isLetter())
                isNumber = true

            if(s[a].isLetter() && isNumber)
                numberCount++

            if(isNumber)
                numberCount =  1
            else
                numberCount = 0

            if(a >= 1) {
                println(s[a] + " " + isNumber + " " + numberCount)

                xy.add(isNumber)
                num.add(numberCount)
            }
        }
        for(bb in 1..(num.size-1)){
            if(num[bb] > 0)
                 num2.add(num[bb])
        }
    }
}