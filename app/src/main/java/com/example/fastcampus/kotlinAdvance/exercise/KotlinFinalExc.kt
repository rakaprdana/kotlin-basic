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
    var nama: String = ""
    var harga: Int = 0
}

object Makanan : Produk()

object Minuman : Produk()

class Pesanan {
    open fun totalHarga(
        pesanan1: Makanan,
        pesanan2: Minuman,
    ): Int = pesanan1.harga + pesanan2.harga
}

class Pelanggan {
    var namaPelanggan: String = ""
    var total = Pesanan().totalHarga()

    fun cetakStruk(namaPelanggan: Pelanggan) {
        println("nama: $namaPelanggan")
        println("Total")
    }
}
