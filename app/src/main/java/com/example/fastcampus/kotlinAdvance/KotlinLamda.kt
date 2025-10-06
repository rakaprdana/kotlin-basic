package com.example.fastcampus.kotlinAdvance

fun basicFun() {
    println("Helo")
}

fun increment(
    num1: Int,
    num2: Int,
) {
    println(num1 + num2)
}

fun returnIncrement(
    num1: Int,
    num2: Int,
): Int = num1 + num2

fun main() {
    val funWithLamda = { println("Hello") }
    val incrementLamda = { num1: Int, num2: Int -> println(num1 + num2) }
    val returnIncrementLamda = { num1: Int, num2: Int -> num1 + num2 }

    basicFun()
    funWithLamda()
    incrementLamda(1, 2)
    println(returnIncrementLamda(1, 3))
}
