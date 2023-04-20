package com.webaligo.kotlinsandbox

import android.media.MediaActionSound

fun main(){
    val fluffy = Animal("Fluffy", "Polar bear")
    val bear = Animal(species = "bear")
    val default = Animal()
    fluffy.introduction()
    bear.introduction()
    default.introduction()
    println(fluffy.name)
    bear.sound = "Roar!!!"
    bear.makeSound()
}

class Animal public constructor(name: String = "no name", species: String = "no species"){
    // Only get
    var name: String
        get() {
            return field.lowercase()
        }
    // Late init
    private lateinit var species: String
    // Only set
    var sound: String = "no sound"
        set(value) {
            field = value
        }
    init{
        this.name = name
        this.species = species
    }
    constructor(name: String = "no name", species: String = "no species", sound: String = "no sound"):this(name,species){
        this.sound = sound
    }

    fun introduction(){
        println("Hi, my name is ${name?:"Nobody"} and I am of species $species!")
    }

    fun makeSound(){
        println(this.sound)
    }
}

