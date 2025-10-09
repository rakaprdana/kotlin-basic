package com.example.fastcampus.kotlinAdvance

interface Animal {
    fun eat()

    fun sleep()
}

class Cat : Animal {
    override fun eat() {
        println("Cat is eating")
    }

    override fun sleep() {
        println("Cat is sleeping")
    }
}

fun main() {
    val newCat = Cat()
    newCat.sleep()
    newCat.eat()
}
