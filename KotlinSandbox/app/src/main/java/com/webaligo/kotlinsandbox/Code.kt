package com.webaligo.kotlinsandbox

fun main(){

    // Booleans & if statements
    val num = 5
    var num2 = 4
    num2 *= 2
    num2 += 2
    val res = (num shl 1) == num2
    when (num2){
        in 1..100 -> println("All makes sense!")
        0 -> {
            println("Nothing makes sense!")
        }
    }

}