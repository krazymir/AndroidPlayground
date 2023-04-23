package com.webaligo.kotlinsandbox

interface Livable{
    fun makeSound(){
        println("blop")
    }

    fun move(distanceMeters: Double)
}

abstract class Animal() : Livable{

    abstract var name:String
    abstract var species:String
    abstract var weightKilos:Double
    fun addWeight(amount: Double){
        weightKilos+=amount
    }
    constructor(name: String, species:String) : this() {
        this.name = name
        this.species = species
    }

    override fun move(distanceMeters: Double){
        println("${this.name} by $distanceMeters meters")
    }
}

class Bear(name: String, species: String, furColor:String) : Animal(name, species){
    override var name: String = "unnamed"
    override var species: String = "undefined"
    override var weightKilos: Double = 0.0
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

