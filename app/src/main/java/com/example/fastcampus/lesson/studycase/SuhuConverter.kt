package com.example.fastcampus.lesson.studycase

fun converter(
    opsi: Int,
    suhu: Int,
) {
    when (opsi) {
        1 -> println("Celcius to Reamur: " + suhu * 0.8)
        2 -> println("Celcius to Fahrenheit: " + (suhu * 1.8) + 32)
    }
}

fun main() {
    converter(2, 28)
}
