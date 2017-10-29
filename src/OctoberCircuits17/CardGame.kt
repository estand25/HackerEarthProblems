package OctoberCircuits17

/*
OctoberCircuits17
Standley Eugene
10/22/2017
*/
fun main(args: Array<String>){
    var n = readLine()!!.toLong()
    var nCards = readLine()!!.replace(" ",",").split(",").map { it.trim().toLong() }

    var m = readLine()!!.toLong()
    var mCards = readLine()!!.replace(" ", ",").split(",").map { it.trim().toLong() }

    var nCardList : MutableList<Long> = nCards.toMutableList()
    var mCardList : MutableList<Long> = mCards.toMutableList()

    for(a in 0..(n-1)){
        for(b in 0..(m-1)) {
            if(nCardList[a.toInt()].toInt() <= mCardList[b.toInt()].toInt())
                nCardList[a.toInt()] = (nCardList[a.toInt()].toInt()+1).toLong()
        }
    }

    var nChanges : MutableList<String>  = mutableListOf<String>()

    for(c in 0..(nCardList.size-1)) {
        if(nCardList[c] != nCards[c])
            nChanges.add("C")
        else
            nChanges.add(nCardList[c].toString())
    }

    var nChangeItem : MutableList<String>  = mutableListOf<String>()
    var nChange2 : MutableList<String>  = nChanges.toMutableList()

    for(d in 0..(nChanges.map {a -> a == "C" }.size-1)) {
       if(nChanges.map {a -> a == "C" }[d])
           nChangeItem.add(nCardList[d].toString())
    }

    nChangeItem.max()

    for(e in 0..(nChanges.map {a -> a == "C" }.size-1)) {
        if(nChanges.map {a -> a == "C" }[e])
            nChanges[e] = nChangeItem.max().toString()
    }

    var dollar: Int = 0

    for(f in 0..(nChange2.size-1)){
        if (nChange2.map {a -> a == "C" }[f]) {
            dollar=dollar+nChanges[f].toInt()-nCards[f].toInt()
        }
    }

    println(dollar)
}