package Basic_Programming.Input_Output

/*
Basic_Programming.Input_Output
Standley Eugene
9/4/2017
*/
fun main(args: Array<String>){
    var target: String? = "42"

    do{
        var i = readLine()!!.toString()
        if(target != i) {
            println(i)
            //println(target)
        }
    }while(target != i)
}