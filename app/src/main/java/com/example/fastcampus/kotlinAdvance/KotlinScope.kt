package com.example.fastcampus.kotlinAdvance

fun main() {
    val message: String? = "Error"
    val length = message?.length?.times(2)
    val text = "Length is $length"
    println(text)

    // scope with lamda argument
    message?.let {
        val length = it.length * 2
        val text = "Length is $length (with scope)"
        println(text)
    }

    // scope with lamda receiver
    val result =
        with(message) {
            println("Value is $this")
            println("with length is ${this?.length}")
        }
}
