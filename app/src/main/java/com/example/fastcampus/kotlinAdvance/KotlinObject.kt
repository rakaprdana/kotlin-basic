package com.example.fastcampus.kotlinAdvance

object CredentialData {
    var userName: String = ""
}

class PersonClass {
    var name: String = ""
    var age: Int = 0

    companion object {
        val MAX_AGE = 100

        fun initialize(
            name: String,
            age: Int,
        ) = PersonClass().apply {
            this.name = name
            this.age = age
        }
    }
}

fun main() {
    CredentialData.userName = "Raka"
    println(CredentialData.userName)
    val person = PersonClass.initialize("Jaxx", 24)
    println(person)
}
