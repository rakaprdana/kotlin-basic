package com.example.fastcampus.lesson.exercise

fun guestEvenOddNumber(number: Int) {
    if (number % 2 == 0) {
        println("Genap")
    } else {
        println("Ganjil")
    }
}

fun validateLengthOfEmail(email: String) {
    // min 10 char & maks 40 char
    if (email.length >= 10 && email.length <= 40) {
        println("Email valid")
    } else {
        println("Email Invalid")
    }
}

enum class ErrorCode {
    ERROR_101,
    ERROR_102,
    ERROR_103,
}

fun validateErrorCode(errorCode: ErrorCode) {
    when (errorCode) {
        ErrorCode.ERROR_101 -> println("Error Jaringan")
        ErrorCode.ERROR_102 -> println("Error Server")
        ErrorCode.ERROR_103 -> println("Error Timeout")
    }
}

fun main() {
    guestEvenOddNumber(10)
    validateLengthOfEmail("raka.pradana01@gmail.com")
    validateErrorCode(ErrorCode.ERROR_102)
}
