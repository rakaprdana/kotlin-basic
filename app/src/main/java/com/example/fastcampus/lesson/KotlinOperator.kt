package com.example.fastcampus.lesson

fun operator() {
    val a = 20
    val b = 3
    val c = 12
    val d = 45

    var result1 = a + b
    var result2 = c + d

    var modulus = a % b // 20 : 3 = 6 * 3 = 18 -> 20 = 2, jadi sisa 2
    println("hasil 1 = " + result1)
    println("hasil 2 = " + result2)
    println("hasil sisa = " + modulus)

    println(result1 == result2)
    println(result1 != result2)

    var poin1 = result1 == result2
    var poin2 = result1 != result2

    println(poin1 && poin2)
    println(poin1 || poin2)
}

fun main() {
    operator()
}
