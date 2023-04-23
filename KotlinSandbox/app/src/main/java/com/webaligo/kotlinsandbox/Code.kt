package com.webaligo.kotlinsandbox

interface Livable{
    var name:String
    var species:String
    var weightKilos:Double
    fun makeSound(){
        println("blop")
    }

    fun addWeight(amount: Double){
        weightKilos+=amount
    }
}

open class Animal() : Livable{

    override var name:String = "no name"
    override var species:String = "unidentified"
    override var weightKilos:Double = 0.0
    constructor(name: String, species:String) : this() {
        this.name = name
        this.species = species
    }

    fun move(distanceMeters: Double){
        println("${this.name} by $distanceMeters meters")
    }
}

class Bear(name: String, species: String, furColor:String) : Animal(name, species){
    override fun makeSound(){
        println("Look for the bear necessities, the simple bear necessities...")
    }
}

fun main(){
    val bear = Bear("Baloo", "bear", "blown")
    val newcomer = Bear("Count Dracula", "vampire", "white")
    println(bear == newcomer)
    bear.addWeight(5.0)
    bear.move(3.5)
    bear.makeSound()
}

