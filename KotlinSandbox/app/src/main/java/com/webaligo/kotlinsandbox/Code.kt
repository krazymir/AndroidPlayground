package com.webaligo.kotlinsandbox

import java.util.Dictionary

fun main() {
    val mixedList: List<Any> = listOf("Bear", 72.3, 26, 12.3f)
    for (obj in mixedList) {
        when (obj) {
            is String -> println("here is the length of the String: ${obj.length}")
            is Double -> println("here is a Double: $obj")
            is List<*> -> println("here is the size of the list: ${obj.toList().size}")
            is Int -> println("here is the remainder of dividing by 3: ${obj % 3}")
            !is Dictionary<*, *> -> println("I don't know what it is but it is not a dictionary")
            else -> print("Unknown type")
        }
    }
//    Not safe
    val elem: String = mixedList[0] as String
//    Safe
    val elem2: String? = mixedList[1] as? String
    println("$elem and $elem2")
}

