package com.example.fastcampus.lesson

fun getType(data: Any) {
    when (data) {
        is Int -> println("Integer")
        is String -> println("String")
        else -> println("Unknown")
    }
}

fun castingExp(data: String) { // casting -> mengubah tipe data
    val input = data.toDouble()
    val discount = 10.0
    val total = input - (input * discount / 100)
    println("Total: " + total)
}

fun main() {
    getType(2)
    getType("Hai")
    getType(true)
    castingExp("1000.100")
}
