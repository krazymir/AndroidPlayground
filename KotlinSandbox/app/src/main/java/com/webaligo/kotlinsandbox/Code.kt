package com.webaligo.kotlinsandbox

fun main() {
    var nums = arrayOf(1,5,6,100)
//    Not safe
    println(nums.contentToString())
    for(elem in nums){
        println("${elem.toString()},")
    }
    println(nums[2])
    nums[2] = 12
    println(nums[2])

    val bg = BubbleGum("Turbo", 2.44)
    val bg2 = BubbleGum("Orbit", 3.44)

    val chewy = arrayOf(bg, bg2, bg.copy())
    println(chewy.contentToString())



}

data class BubbleGum(val name: String, val price: Double)

