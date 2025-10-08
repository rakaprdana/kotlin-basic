package com.example.fastcampus.kotlinAdvance

// Modifier -> hak akses terhadap variable, fun, class
class KotlinVisibiltyModifier {
    private val dataUsername = "admin123"
    private val dataPassword = "123"

    fun loginLogic(
        username: String,
        password: String,
    ) {
        if (username == dataUsername && password == dataPassword) {
            println("Login success")
        } else {
            println("Login Invalid")
        }
    }
}

fun main() {
    KotlinVisibiltyModifier().loginLogic("admin123", "123")
}
