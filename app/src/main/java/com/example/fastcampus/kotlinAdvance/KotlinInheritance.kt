package com.example.fastcampus.kotlinAdvance

open class Vehicle {
    protected var wheels: Int = 0 // atribut/properti

    fun showWheelsOfVehicle() {
        println("This vehicle have $wheels wheels")
    }

    fun setNumberOfWheels(wheels: Int) {
        this.wheels = wheels
    }

    fun start() {
        println("Vehicle is started!")
    }
}

class Car : Vehicle() {
    var engineType: String = " "

    fun showEngineType() {
        println("This car use $engineType")
    }
}

fun main() {
    val car = Car()
    car.setNumberOfWheels(4)
    car.showWheelsOfVehicle()
    car.engineType = "v5"
    car.showEngineType()
    car.start()
}
