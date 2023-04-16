package com.webaligo.kotlinsandbox

fun main(){

    // Booleans & if statements
    val num = 5
    var num2 = 4
    num2 *= 2
    num2 += 2
    val res = (num shl 1) == num2
    when (res){
        true -> println("All makes sense!")
        false -> {
            println("Nothing makes sense!")
        }
    }

}