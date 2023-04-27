package com.webaligo.kotlinsandbox

fun main() {
    var nums = listOf(1,5,6,100).toMutableList()

    for(elem in nums){
        println("${elem.toString()},")
    }
    println(nums[2])
    nums.add(12)
    print(nums[2])
    println(nums[2])

    val bg = BubbleGum("Turbo", 2.44)
    val bg2 = BubbleGum("Orbit", 3.44)

    val chewy = mutabistOf(bg, bg2, bg.copy())
    println(chewy)
    chewy.removeAll
    println(chewy)



}

data class BubbleGum(val name: String, val price: Double)

