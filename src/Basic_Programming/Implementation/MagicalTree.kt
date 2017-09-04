package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var L = readLine()!!.toInt()
    var maxExpres: Int?

    for(i in 0..L){
        var input = readLine()!!.toCharArray()
        var temp: Int?
        var temp1 : MutableList<String> = mutableListOf<String>()
        var temp2 : MutableList<String> = mutableListOf<String>()

        for (j in 0..(input.size-1)){
            if(j%2 == 0) {
                temp1.add(input[j].toString())

                if((temp2.size-1)%2 == 0){
                    println("m : " + if(temp1[j].isNullOrEmpty()) "null" else temp1[j])
                    //println("b : " + if(temp2[j].isNullOrEmpty()) "null" else temp2[j])

                    println("\n")
                }
            }
            else {
                temp2.add(input[j].toString())
            }
        }

        println("\n")

        for(k in 0..(temp1.size-1)){
            print(temp1[k]+" ")
        }

        println("\n")

        for(i in 0..(temp2.size-1)){
            print(" " + temp2[i])
        }
    }
}