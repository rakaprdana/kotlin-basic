package com.example.fastcampus.kotlinAdvance.exercise

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

abstract class Produk {
    abstract var nama: String
    abstract var harga: Int
}

class Makanan(
    override var nama: String,
    override var harga: Int,
) : Produk()

class Minuman(
    override var nama: String,
    override var harga: Int,
) : Produk()

class Pesanan {
    var makanan = Makanan("Bebek Goreng", 45000)
    var minuman = Minuman("Es teh", 10000)

    fun sumHarga(): Int = makanan.harga + minuman.harga
}

class Pelanggan {
    var nama: String = "Raka"
    val pesanan = Pesanan()

    fun showName() {
        println("Pelanggan: $nama")
    }

    fun showTotalHarga() {
        println("Total harga: Rp.${pesanan.sumHarga()}")
    }
}

fun main() {
    val newUser = Pelanggan()
    newUser.showName()
    newUser.showTotalHarga()
}
