package com.example.fastcampus.lesson

fun listExample() {
    val numberList = mutableListOf(1, 5, 6, 7, 9, 10) // mutable untuk menambahkan new value
    println(numberList)
    numberList.add(18)
    println(numberList)
}

fun setExample() {
    val numberSet1 = mutableSetOf(1, 4, 4, 6, 8, 8, 8, 2, 9, 1)
    println(numberSet1)
    val numberSet2 = setOf(22, 43, 4, 2)
    val interception = numberSet2.intersect(numberSet1) // irisan dari 2 collection
    println("hasil" + interception)
}

fun mapExample() {
    val bookshelf =
        mutableMapOf(
            1 to "Buku Pemrograman",
            2 to "Buku Bahasa",
            3 to "Buku Gambar",
        )
    bookshelf[4] = "Buku Tulis"
    println(bookshelf[2])
    println(bookshelf[4])
}

fun main() {
    listExample()
    setExample()
    mapExample()
}
