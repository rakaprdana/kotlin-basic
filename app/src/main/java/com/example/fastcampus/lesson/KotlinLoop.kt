package com.example.fastcampus.lesson

fun forLoop() {
    val fruits = arrayOf("Apple", "Grape", "Banana", "Kiwi", "Manggo")
    for (i in fruits) {
        println(i)
    }
    for (i in 1..10) {
        println(i)
    }
}

fun whileLoop() {
    var start = 1
    val end = 5

    while (start <= end) {
        if (start % 2 == 0) {
            println("$start angka genap")
        } else {
            println("$start angka ganjil")
        }
        start++
    }
}

fun doWhileLoop() {
    var start = 6
    val end = 5
    do {
        if (start % 2 == 0) {
            println("$start angka genap")
        } else {
            println("$start angka ganjil")
        }
        start++
    } while (start <= end)
}

fun main() {
    forLoop()
//    whileLoop()
//    doWhileLoop()
}
