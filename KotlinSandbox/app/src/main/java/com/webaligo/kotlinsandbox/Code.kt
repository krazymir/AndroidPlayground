package com.webaligo.kotlinsandbox

fun main(){

    // Booleans & if statements
    val num = 5
    var num2 = 4
    num2 *= 2
    num2 += 2
    val res = (num shl 1) == num2
    if((num shl 1) == num2) {
        println("The result is ${res}")
    }else if (false){
        println("Something is broken!!!")
    }else {
        println("Something is broken!!!")
    }

}