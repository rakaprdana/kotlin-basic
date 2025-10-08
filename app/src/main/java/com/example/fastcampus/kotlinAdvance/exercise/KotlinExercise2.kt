package com.example.fastcampus.kotlinAdvance.exercise

fun <T> isGreaterThan(
    value: T,
    value2: T,
): Boolean =
    when {
        value is Int && value2 is Int -> value > value2 as Int
        value is Double && value2 is Double -> value > value2 as Double
        else -> false
    }

/*
*2.  Buatlah sebuah fun extension tipe data Int u/ check bilangan merupakan kelipatan dari bilangan lainnya
* exp -> 100 isMultiplicationOf 5 -> true
*/
fun Int.isMultiplicationOf(number: Int): Boolean = this % number == 0

/**
 * 3. Buatlah sebuah fun extension untuk tipe data Double u/ menghitung diskon dari harga
 exp -> 1000000.0 calculateDiscount 5.0 ->95000.0
 */

infix fun Double.calculateDiscount(discount: Double): Double = this - (this * discount / 100)

sealed class StatusResource<T> {
    data class Success<T>(
        val data: T,
    ) : StatusResource<T>()

    data class Error<T>(
        val data: T,
    ) : StatusResource<T>()

    object Loading : StatusResource<Nothing>()
}

fun main() {
    println(isGreaterThan(10.0, 20.0))
    println(100.isMultiplicationOf(5))
    println(100000.0 calculateDiscount 5.0)
    println(StatusResource.Error("Error server").data)
}
