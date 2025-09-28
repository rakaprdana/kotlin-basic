package com.example.fastcampus.lesson

fun main() {
    val a = 10
    val b = 0
    try {
        println(a / b)
    } catch (err: Exception) {
        println("Terdapat kesalahan")
    }
}
