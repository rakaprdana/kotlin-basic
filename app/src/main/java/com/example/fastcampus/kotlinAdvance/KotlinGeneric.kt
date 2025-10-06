package com.example.fastcampus.kotlinAdvance

fun <T> genericFun(dataList: List<T>) {
    for (i in dataList) {
        println(i)
    }
}

class GenericClass<T>(
    val value: T,
)

fun main() {
    genericFun(listOf("Halo", "Raka"))
    genericFun(listOf(10, 2, 4, 1))

    // with class
    val kotlinInt = GenericClass(2)
    val kotlinString = GenericClass("Hello world!")

    println("with class: ${kotlinInt.value}, ${kotlinString.value}")
}
