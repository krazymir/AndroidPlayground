package com.webaligo.kotlinsandbox

fun main() {
    val chewy = mapOf<String, BubbleGum>("Favourite" to BubbleGum("Orbit", 2.44), "Best" to BubbleGum("Turbo", 3.44))

    for(key in chewy.keys){
        println("$key - ${chewy[key]}")
    }
    var mutableChewy = chewy.toMutableMap()
    mutableChewy.put("Best Bubbles", BubbleGum("Hubba Bubba", 2.88))
    for(key in mutableChewy.keys){
        println("$key - ${mutableChewy[key]}")
    }

}

data class BubbleGum(val name: String, val price: Double)

