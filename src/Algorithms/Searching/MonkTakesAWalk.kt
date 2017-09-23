package Algorithms.Searching

import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue

/*
Algorithms.Searching.s
Standley Eugene
9/23/2017
*/
fun main(args: Array<String>){
    var T = readLine()!!.toInt()
    var vowel = arrayOf("A","E","I","O","U","a","e","i","o","u")

    for(a in 0..(T-1)){
        var input = readLine()!!.toCharArray()
        var count = 0
//        var done = false
//        var loc = 1

//        while(done){
//            if(input.contains(vowel)){
//                count++
//                input.replace(vowel.get(loc),"")
//                println(vowel[loc])
//            }else{
//                loc++
//            }
//        }

        for (b in 0..(vowel.size-1)){
            println(vowel[b])
            count += input.filter { it -> it.equals(vowel[b]) }.size
        }

        println(count)
    }
}