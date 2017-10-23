package OctoberCircuits17

/*
OctoberCircuits17
Standley Eugene
10/22/2017
*/
fun main(args: Array<String>){
    var n = readLine()!!.toInt()
    var nCards = readLine()!!.replace(" ",",").split(",").map { it.trim() }

    var m = readLine()!!.toInt()
    var mCards = readLine()!!.replace(" ", ",").split(",").map { it.trim() }

    var nCardList : MutableList<String> = nCards.toMutableList()
    var mCardList : MutableList<String> = mCards.toMutableList()

    for(a in 0..(n-1)){
        for(b in 0..(m-1)) {
            if(nCardList[a].toInt() <= mCardList[b].toInt())
                nCardList[a] = (nCardList[a].toInt()+1).toString()
        }
    }

    var change = 0

    for(c in 0..nCardList.size-1) {
        if(nCardList.get(c) != nCards.get(c))
            change = nCardList.get(c).toInt()
    }

    for(c in 0..mCardList.size-1) {
        println(mCardList[c])
    }
}