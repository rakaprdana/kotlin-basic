package com.example.fastcampus.kotlinAdvance

// property extension
val Int.slice: Int
    get() = this / 2

// function extension
fun Int.sum(number: Int): Int = this + number

// infix extension
infix fun Int.decrement(number: Int) = this - number

fun main() {
    println(10.slice)
    println(3.sum(4))
    println(3 decrement 4)
}
