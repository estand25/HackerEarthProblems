package Basic_Programming.Input_Output/*
-Solved
Standley Eugene
9/3/2017
*/
fun main(args: Array<String>){
    var i = readLine()!!.toCharArray()
    var o: String? = null
    for (char in 0..i.size-1){
        if(!i[char].isLowerCase()){
            when(o.isNullOrEmpty()){
                true -> o = i[char].toLowerCase().toString()
                false ->
                o = (o + i[char].toLowerCase()).toString()
            }
        }
        else{
            when(o.isNullOrEmpty()){
                true -> o = i[char].toUpperCase().toString()
                false ->
                o = (o + i[char].toUpperCase()).toString()
            }
        }
    }

    println(o)
}