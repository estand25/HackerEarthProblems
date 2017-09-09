package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/6/2017
*/
fun main(args: Array<String>){
    var t = readLine()!!.toInt()
    var numberCount: Int = 0

    for(aa in 1..t) {
        var num : MutableList<Int> = mutableListOf<Int>()
        var c = readLine()!!.toInt()
        var s = readLine()!!.toCharArray()
        var t: String? = null

        for (a in 0..(c-1)) {
            var isNumber = false

            if (!s[a].isLetter())
                isNumber = true

            if(isNumber)
                numberCount = 1
            else
                numberCount = 0


            if(t.isNullOrEmpty()) {
                t = numberCount.toString()
                num.add(numberCount)
            }
            else
                if(t?.last().toString() == "1" && numberCount == 1){

                } else {
                    if(t?.last().toString() == "0" && numberCount == 0) {

                    }else {
                        t = t + "," + numberCount.toString()
                        num.add(numberCount)
                    }
                }

        }
        var count = 0

        for(bb in 0..(num.size-1)){
            if(num[bb] == 1)
                count++
        }

        println(count)
        t = null

    }
}