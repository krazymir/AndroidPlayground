package com.webaligo.kotlinsandbox

data class Animal(val name: String, val species: String)
fun main(){
    val bear = Animal("Paddington", "bear")
    val newcomer = Animal("Paddington", "bear")
    println(bear.equals(newcomer))

    val copy = newcomer.copy()
    println("${copy.toString()}")
}

