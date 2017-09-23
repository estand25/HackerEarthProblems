package Basic_Programming.Implementation

/*
Basic_Programming.Implementation
Standley Eugene
9/22/2017
*/
fun main(args: Array<String>){
    var pb = readLine()!!.toInt()
    var sLine = readLine()!!.replace(" ","").toCharArray()

    var i = sLine[0]
    var j = sLine[1]
    var p = sLine[2]

    var lines : MutableList<String> = mutableListOf<String>()

    var line:String = ""

    var count:Int = p.toString().toInt()

    println(pb)
    println(i + ", " + j)
    println(p)
    println(p.toString().toInt())
    println(pb.toString().toInt())

    for(a in 0..(pb.toString().toInt()-1)){
        line = ""
        var limit: Boolean = false

        while(!limit){
            if(line.isNullOrEmpty()) {
                line += "0"
            }
            else {
                if (lines.size == 0 || lines.size == (pb.toString().toInt()-1)) {
                    line += " 0"
                }else{
                    if(line.replace(" ","").length == (pb.toString().toInt()-1))
                        line += " 0"
                    else {
                        if (lines.size <= p.toString().toInt()){
                            line += " " + lines.size.toString()
                        }
                        else {
                            var i = (lines.size - p.toString().toInt())+1
                            line += " " + i //(lines.size - p.toString().toInt()).toString()
                        }
                    }
                }
            }

            if(line.replace(" ","").length >= pb.toString().toInt())
                limit = true
        }
        lines.add(line)
        println(line)
    }
}