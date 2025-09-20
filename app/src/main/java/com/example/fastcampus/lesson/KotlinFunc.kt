package com.example.fastcampus.lesson

fun showMyName(name: String) {
    println(name)
}

fun getMyAgeAfter5Years(currentAge: Int): Int {
    val ageAfter5Year = currentAge + 5
    return ageAfter5Year
}

fun orderFriedRice(isSpicy: Boolean = false) { // menggunakan sebuah default value isSpicy boolean
    if (isSpicy) {
        println("Spicy Fried Rice")
    } else {
        println("Original Fried Rice")
    }
}

fun main() {
    showMyName("Raka")
    println(getMyAgeAfter5Years(18))
    orderFriedRice()
}
