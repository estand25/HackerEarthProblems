package DecemberCircuit17

fun main(args: Array<String>){
    var NMK = readLine()!!.replace(" ",",").split(",").map { it.toInt() }

    var N = NMK[0]
    var M = NMK[1]
    var K = NMK[2]

    println("Input: N= $N, M= $M, K= $K")

    var a = readLine()!!.replace(" ", ",").split(",").map{ it.toInt()}
    var b = readLine()!!.replace(" ", ",").split(",").map{ it.toInt()}

    //var result : Array<String,String> = null

    println("-- Input -- (1,1) -- ")
    for (i in 0..(N-1)){
        println("Pairs= ${a[i]}, ${b[i]}")
    }

    println("-- Input -- ([1,1],[1,1]) -- ")
    for (i in 0..(N-1)){
        for (j in 0..(N-1)){
            var q = a[i]-b[j]
            if(q <= K){
                println("Pairs= ${a[i]}, ${b[j]}")
            }
        }
    }
}