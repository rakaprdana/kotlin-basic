package com.example.fastcampus.lesson.studycase

import android.health.connect.datatypes.units.Length

class RectangleClass(
    length: Int,
    height: Int,
) {
    val result = (length * height) / 2
}

fun rectangleFun(
    length: Int,
    height: Int,
) {
    val result = (length * height) / 2
    println("Hasil dengan fun $result")
}

fun main() {
    val useClass = RectangleClass(20, 2)
    println("Hasil dgn class ${useClass.result} ")
    rectangleFun(20, 2)
}
