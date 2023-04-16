package com.webaligo.kotlinsandbox

fun main(){

    // Booleans & if statements

    var num = 4

    while(num < 17){

        if(num % 3 == 0 && num % 5 == 0){
            println("$num FizzBuzz")
        }else if(num % 3 == 0){
            println("$num Fizz")
        }else if(num % 5 == 0){
            println("$num Buzz")
        }
        num++
    }

    num = 0
    do{
        println("$num")
    }while (++num < 10)

    for(i in 0..10){
        println("For $i")
    }

    for(i in 0 until 10){
        println("For $i")
    }

    for(i in 3 downTo 1 step 2){
        println("For $i")
    }

    for(i in 3.downTo(1).step(2)){
        if(i < 3){
            continue
        }
        println("For $i")
        break;
    }
}