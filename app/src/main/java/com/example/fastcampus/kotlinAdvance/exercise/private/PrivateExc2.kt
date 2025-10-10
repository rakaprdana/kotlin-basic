package com.example.fastcampus.kotlinAdvance.exercise.private

abstract class Vehicle(
    var distance: Int,
) {
    abstract fun calculateCost(): Double
}

class Truck(
    distance: Int,
) : Vehicle(distance) {
    override fun calculateCost(): Double = distance * 5000.0
}

class Motorcycle(
    distance: Int,
) : Vehicle(distance) {
    override fun calculateCost(): Double = distance * 2000.0
}

fun main() {
    val newTruck = Truck(80)
    val newMotor = Motorcycle(10)
    val cost = newTruck.calculateCost()
    val cost2 = newMotor.calculateCost()
    println("Cost: $cost")
    println("Cost: $cost2")
}
