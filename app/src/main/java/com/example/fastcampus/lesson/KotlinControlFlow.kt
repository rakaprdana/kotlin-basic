package com.example.fastcampus.lesson

/*
* Dalam Kotlin, penggunaan switch-case diganti dengan
* menggunakan when. Memiliki konsep serupa seperti if - else
* */

fun controlFlow() {
    val levelPlayer = 5
    if (levelPlayer == 10) {
        println("Feature Unlock")
    } else {
        println("Level is too lower")
        println("Want a exp?")
        var answer = true
        if (answer) {
            val levelPlayer = levelPlayer + 5
            println("Your level is " + levelPlayer)
            println("Want a weapons? choose the weapons")
            // contoh penggunaan when (konsep sama dgn switch-case)
            var weaponNumber = 2
            when (weaponNumber) {
                1 -> println("Demon Sword")
                2 -> println("Angel Sword")
                3 -> println("Hammer")
                else -> println("No choice")
            }
        }
    }
}

fun main() {
    controlFlow()
}
