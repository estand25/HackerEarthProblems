package Basic_Programming.Input_Output

/*
Basic_Programming.Input_Output
Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    val o = readLine()!!.toString()
    var hexNum: Int?
    var charNum: Int?

    charNum = when{
        o == "a" || o == "A" -> 0
        o == "b" || o == "B" -> 1
        o == "c" || o == "C" -> 2
        o == "d" || o == "D" -> 3
        o == "e" || o == "E" -> 4
        o == "f" || o == "F" -> 5
        o == "g" || o == "G" -> 6
        o == "h" || o == "H" -> 7
        o == "i" || o == "I" -> 8
        o == "j" || o == "J" -> 9
        o == "k" || o == "K" -> 10
        o == "l" || o == "L" -> 11
        o == "m" || o == "M" -> 12
        o == "n" || o == "N" -> 13
        o == "o" || o == "O" -> 14
        o == "p" || o == "P" -> 15
        o == "q" || o == "Q" -> 16
        o == "r" || o == "R" -> 17
        o == "s" || o == "S" -> 18
        o == "t" || o == "T" -> 19
        o == "u" || o == "U" -> 20
        o == "v" || o == "V" -> 21
        o == "w" || o == "W" -> 22
        o == "x" || o == "X" -> 23
        o == "Y" || o == "Y" -> 24
        o == "z" || o == "Z" -> 25
        else -> 99
    }

    if(o.toCharArray()[0].isUpperCase())
        hexNum = 65
    else
        hexNum = 97

    println("${hexNum+charNum}")
}