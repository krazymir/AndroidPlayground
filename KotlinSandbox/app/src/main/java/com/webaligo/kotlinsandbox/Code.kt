package com.webaligo.kotlinsandbox

fun main(){
//    TODO: Should change to a var, since I would need to change the variable
    val strSecs = "436117076600000000"
    val secontsUnverseLife: ULong = strSecs.toULong()
    val pi: Double = 3.14159265
    val isUniverseExpanding:Boolean = true

    val a:String = "Android Masterclass"
    val b:Float = 13.37F
    val c:Double = 3.14159265358979
    val d:Byte = 25
    val e:Short = 2023
    val f:Long = 18881234567
    val g:Boolean = true

    val h = 'a'

    println("The Universe is " + secontsUnverseLife.toString() + " old")
    println("The first digit is " + strSecs[0])
    println("The last digit is " + strSecs[strSecs.length - 1])
}