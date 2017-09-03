/*

Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var n = readLine()!!.toInt()
    var o: String? = null

    var flag = false
    for (item in 2..n) {
        flag = false
        for (j in 2..item / 2) {
            if (item.rem(j) == 0) {
                flag = true
                break
            }
        }
        if (flag == false)
            if(o.isNullOrEmpty())
                o = item.toString()
            else
                o = o + " " + item.toString()
        else
            continue
    }
    println(o)
}
