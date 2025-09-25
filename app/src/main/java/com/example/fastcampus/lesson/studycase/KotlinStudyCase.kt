package com.example.fastcampus.lesson.studycase

data class PlayerInfo(
    val name: String,
    var level: Int,
)

fun gameplay(
    name: String,
    level: Int,
) {
    var player = PlayerInfo(name, level)
    if (player.level >= 10) {
        println("Feature unlock")
    } else {
        println("Level is too low! Want some exp?")
        for (exp in player.level..10) {
            println("leveling up $exp")
            if (exp == 10) println("Feature unlock")
        }
    }
}

fun main() {
    gameplay("Player 1", 11)
}
