package Basic_Programming/*
-Solved
Standley Eugene
9/3/2017
*/
fun main(ages: Array<String>){
    var i = readLine()!!.toCharArray()
    var o: String? = null
    for (char in 0..i.size-1){
        if(!i[char].isLowerCase()){
            print(i[char].toLowerCase())
        }
        else{
            print(i[char].toUpperCase())
        }
    }
}