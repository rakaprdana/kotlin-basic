package com.example.fastcampus.lesson.studycase

import android.health.connect.datatypes.units.Length

data class FruitShelf(
    val id: Int,
    val name: String,
    val price: Int,
    val stock: Int,
)

val fruits =
    listOf<FruitShelf>(
        FruitShelf(1, "Apple", 10000, 7),
        FruitShelf(2, "Banana", 15000, 12),
        FruitShelf(3, "Grape", 25000, 20),
        FruitShelf(4, "Cherry", 50000, 40),
    )

fun main() {
    for (i in fruits) {
        if (i.stock < 20) {
            println("Nama ${i.name} dan stok ${i.stock}")
        }
    }
}
