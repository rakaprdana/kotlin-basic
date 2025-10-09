package com.example.fastcampus.kotlinAdvance

abstract class Credentials {
    abstract fun signIn(
        email: String,
        password: String,
    )

    abstract fun signUp(
        name: String,
        email: String,
        password: String,
        confirmPassword: String,
    )
}

class User : Credentials() {
    override fun signIn(
        email: String,
        password: String,
    ) {
        val dataEmail = "User123"
        val dataPassword = "123"
        when {
            (email != dataEmail) || (password != dataPassword) -> println("Login Failed")
            else -> println("Login Success")
        }
    }

    override fun signUp(
        name: String,
        email: String,
        password: String,
        confirmPassword: String,
    ) {
        if (password != confirmPassword) {
            println("Password is different")
        } else {
            println("Sign Up Success")
        }
    }
}

fun main() {
    val logicTest = User()
    logicTest.signIn("User123", "123")
    logicTest.signUp("Raka", "raka123@gmail.com", "123", "123")
}
