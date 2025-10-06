package com.example.fastcampus.kotlinAdvance

class KotlinLazy {
    val age: Int = 10
    lateinit var name: String // variable tanpa value
    val number: Int by lazy {
        println("Number was created")
        age + 10
    }
}

fun main() {
    val kotlinLazy = KotlinLazy()
    println(kotlinLazy.age)
    println(kotlinLazy.number)
}
