package com.example.fastcampus.lesson

class NormalClass {
    private val name = "Raka Pradana"

    fun showName() {
        name
    }
}

class DataClass(
    val name: String, // class yg berguna u/ mengirim data
)

enum class Gender {
    // class yang berisi sesuatu/data yang pasti value-nya
    MALE,
    FEMALE,
}

sealed class SealedClass { // sama dengan enum, namum lebih dinamis
    // dinamis yg dimaksud ialah mampu menanganin tipe class / tipe data yang berbeda
    object ChildClass : SealedClass()

    data class ChildClass2(
        val name: String,
    ) : SealedClass()
}

class KotlinClass {
    class NestedClass { // bisa diakses di luar parent class(KotlinClass)
        fun showName() = "Raka"
    }

    inner class InnerClass { // hanya bisa diakses di parent class(KotlinClass
        fun showName() = "Pradana"
    }
}

fun main() {
    val normalClass = NormalClass()
    println(normalClass.showName())
    val dataClass = DataClass("Tes")
    println(dataClass.name)

    val nestedClass = KotlinClass.NestedClass()
    // val innerClass = KotlinClass.InnerClass() // tidak bisa diakses selain parent
}
