package com.webaligo.kotlinsandbox

fun main() {
    var nums = setOf(1,5,6,100)

    for(elem in nums){
        println("${elem.toString()},")
    }
    println(nums.size)
    var mutableNumbners = nums.toMutableSet()
    mutableNumbners.add(12)
    mutableNumbners.add(12)
    print(mutableNumbners)

    val bg = BubbleGum("Turbo", 2.44)
    val bg2 = BubbleGum("Orbit", 3.44)

    val chewy = mutableSetOf<BubbleGum>(bg, bg2, bg.copy())
    println(chewy)
    chewy.removeIf { it.price > 3 }
    println(chewy)



}

data class BubbleGum(val name: String, val price: Double)

