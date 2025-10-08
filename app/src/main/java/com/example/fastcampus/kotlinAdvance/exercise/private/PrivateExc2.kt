package com.example.fastcampus.kotlinAdvance.exercise.private

fun countVowel(input: String) {
    for (index in input.indices) {
        when (input[index]) {
            'a', 'i', 'u', 'e', 'o' -> println("${input[index]} is vowel")
        }
    }
}

fun main() {
    countVowel("Halo Dunia")
}
