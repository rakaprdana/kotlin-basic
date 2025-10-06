package com.example.fastcampus.kotlinAdvance

import android.graphics.Color

data class Person(
    val name: String,
    val age: Int,
)

enum class ColorClass(
    colorCode: Int,
) {
    RED(Color.RED),
    GREEN(Color.GREEN),
    BLUE(Color.BLUE),
}

fun main() {
    println(Person("Raka", 21))
    println(ColorClass.RED)
}
