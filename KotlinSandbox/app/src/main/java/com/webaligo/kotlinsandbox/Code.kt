package com.webaligo.kotlinsandbox

fun main(){


    var nullableStr : String? = "Yey"
    val nullableLength = nullableStr?.length

    nullableLength?.let{println("The length is $nullableLength")}
//  The Elvis operator
    val notNullableStr = nullableStr ?:"Yey, Elvis!"
    println("The string is $notNullableStr")

//  Not null assertion operator - it will throw KotlinNullPointerException if the value is null
    println("The upper case string is ${nullableStr!!.uppercase()}")
}