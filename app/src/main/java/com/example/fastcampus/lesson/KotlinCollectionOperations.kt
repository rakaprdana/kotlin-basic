package com.example.fastcampus.lesson

fun filterListExp() {
    println("Filter list")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenNumber = numberList.filter { it % 2 == 0 }
    val oddNumber = numberList.filterNot { it % 2 == 0 }
    println("Genap: " + evenNumber)
    println("Ganjil: " + oddNumber)
}

fun mapListExp() {
    println("Mapping")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val mapNumber = numberList.map { it * 10 }
    println(mapNumber)
}

fun countListExp() {
    println("Count List")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val total = numberList.count { it % 2 == 0 } // menghitung hasil dri condition
    println(total)
}

fun findListExp() {
    println("Find List")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenNumber = numberList.find { it % 2 == 0 } // menemukan angka genap pertama kali => 2
    println(evenNumber)
}

fun firstListExp() {
    println("First List")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val firstNumber = numberList.first()
    val lastNumber = numberList.last()
    println("Angka pertama: " + firstNumber)
    println("Angka Terakhir: " + lastNumber)
}

fun sortedListExp() {
    println("Sorted List")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val ascending = numberList.sorted()
    val descending = numberList.sortedDescending()

    println("Ascending: " + ascending)
    println("Descending: " + descending)
}

fun sumExp() {
    println("Sum Example")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val total = numberList.sum()
    println("Total: " + total)
}

fun main() {
    filterListExp()
    mapListExp()
    countListExp()
    findListExp()
    firstListExp()
    sortedListExp()
    sumExp()
}
