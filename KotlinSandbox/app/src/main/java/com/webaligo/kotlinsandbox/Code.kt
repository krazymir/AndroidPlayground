package com.webaligo.kotlinsandbox

fun main(){

    // Booleans & if statements
    val num = 5
    var num2 = 4
    num2 *= 2
    num2 += 2
    val something: Any = 22
    val res = (num shl 1) == num2
    when (num2){
        in 1..100 -> println("All makes sense!")
        0 -> {
            println("Nothing makes sense!")
        }
        else -> {
            println("Nothing makes sense!")
        }
    }

    when (something){
        is Int -> println("All makes sense!")
        !is Boolean -> {
            // Will not be executed, since it will only execute the first match
            println("Not a boolean!")
        }
        else -> {
            println("Nothing makes sense!")
        }
    }

}