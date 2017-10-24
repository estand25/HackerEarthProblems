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

    var nChanges : MutableList<String>  = mutableListOf<String>()

    for(c in 0..(nCardList.size-1)) {
        if(nCardList.get(c) != nCards.get(c))
            nChanges.add("C")
        else
            nChanges.add(nCardList[c])
    }

    var nChangeItem : MutableList<String>  = mutableListOf<String>()
    var nChange2 : MutableList<String>  = nChanges.toMutableList()

    for(c in 0..(nChanges.map {a -> a.equals("C") }.size-1)) {
       if(nChanges.map {a -> a.equals("C") }[c])
           nChangeItem.add(nCardList[c])
    }

    nChangeItem.max()

    for(c in 0..(nChanges.map {a -> a.equals("C") }.size-1)) {
        if(nChanges.map {a -> a.equals("C") }[c])
            nChanges[c] = nChangeItem.max().toString()
    }

    var dollar: Int = 0

    for(c in 0..(nChange2.size-1)){
        if (nChange2.map {a -> a.equals("C") }[c]) {
            dollar=dollar+nChanges[c].toInt()-nCards[c].toInt()
        }
    }

    println(dollar)
}