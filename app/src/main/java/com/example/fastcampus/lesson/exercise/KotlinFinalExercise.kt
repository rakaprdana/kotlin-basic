package com.example.fastcampus.lesson.exercise

fun defineTheGradeOfNumber(numberList: MutableList<Int>) {
    for (grade in numberList) {
        when {
            grade >= 86 -> println("Nilai A")
            grade >= 76 -> println("Nilai B")
            grade >= 66 -> println("Nilai C")
            else -> println("Nilai D")
        }
    }
}

fun findListOfDiscountedPrice(amountList: MutableList<Double>) {
    val discount = 0.1
    for (price in amountList) {
        if (price <= 20000) {
            val result = price - (price * discount)
            println("Total: " + result)
        }
    }
}

fun showDataBasedOnType(firstData: Any) {
    when (firstData) {
        is Int ->
            println(
                if (firstData % 2 == 0) "Genap" else "Ganjil",
            )
        is String -> println(firstData.length)
        else -> println(firstData)
    }
}

fun main() {
//    defineTheGradeOfNumber(mutableListOf(80, 90, 70))
//    findListOfDiscountedPrice(mutableListOf(10000.0, 15000.0, 30000.0))
    showDataBasedOnType(true)
}
