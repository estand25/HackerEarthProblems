package Basic_Programming.Input_Output

/*

Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var l = readLine()!!.toInt()
    var n = readLine()!!.toInt()
    //var wXh: MutableList<String> = mutableListOf<String>()

    for(di in 0..(n-1)){
        var wXhToString = readLine()!!.toString().replace(" ",",").split(",").map{it.trim()}
        //var element = wXhToString.replace(" ",",").split(",").map{it.trim()}

        if(wXhToString[0].toInt() < l || wXhToString[1].toInt() < l)
            println("UPLOAD ANOTHER")
        else if((wXhToString[0].toInt() > l || wXhToString[1].toInt() > l) && wXhToString[0] != wXhToString[1])
            println("CROP IT")
        else if((wXhToString[0].toInt() >= l && wXhToString[1].toInt() >= l) || wXhToString[0] == wXhToString[1])
            println("ACCEPTED")
    }

//    for(i in 0..(n-1)){
//        println(wXh.get(i))
//    }
}

//L - 180
//N - 3
//W - 640 H - 480
//W - 120 H - 300
//W - 180 H - 180