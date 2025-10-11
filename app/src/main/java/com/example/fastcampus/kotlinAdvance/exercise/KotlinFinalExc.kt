package com.example.fastcampus.kotlinAdvance.exercise

import kotlin.math.min

/**
 * 1. Buatlah sebuah kelas bernama Makanan, Minuman, Pesanan dan Pelanggan
 * 2. Buatlah properti masing2 kelas tersebut
 * Makanan: nama dan harga
 * Minuman: nama dan harga
 * Pesanan: makanan dan minuman
 * Pelanggan: nama dan pesanan
 * 3. Buatlah fun masing2 kelas
 * Pesanan->menghitung total harga dari makanan dan minuman
 * Pelanggan->menampilkan nama pelanggan dan total harga dari makanan
 *
 * expected result:
 *Nama Pelanggan= John doe
 *Total Pesanan= Rp100000
 * **/

abstract class Product {
    abstract val name: String
    abstract val price: Int
}

class Foods(
    override val name: String,
    override val price: Int,
) : Product()

class Drinks(
    override val name: String,
    override val price: Int,
) : Product()

class Orders(
    val foods: Foods,
    val drinks: Drinks,
) {
    fun getTotal(): Int = foods.price + drinks.price
}

class User(
    val nameUser: String,
    val orders: Orders,
) {
    fun showUser() {
        println("Consument: $nameUser")
    }

    fun showTotal() {
        println("Your total is: ${orders.getTotal()}")
    }
}

fun main() {
    val newFood = Foods("Ayam Geprek", 14000)
    val newDrink = Drinks("Es teh", 5000)
    val newOrder = Orders(newFood, newDrink)
    val newUser = User("Raka", newOrder)
    newUser.showUser()
    newUser.showTotal()
}
