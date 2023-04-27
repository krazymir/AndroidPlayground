package com.webaligo.kotlinsandbox

fun main() {
    val nums = ArrayList<Double>()
    var avg = 0.0
    nums.add(3.54)
    nums.add(4.66)
    nums.add(386.34)
    nums.add(-32.99)
    nums.add(3322.12)
    nums.add(2.009)
    nums.add(-992.0)
    println("Average is ${nums.average()}")
    for(n in nums){
        avg += n
    }
    avg /= nums.size
    println("Manual average is ${nums.average()}")
}

