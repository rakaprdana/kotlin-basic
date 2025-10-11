package com.example.fastcampus.kotlinAdvance.exercise.private

/**
 * 1. Buatlah abstract class bernama Item, dengan properti nama dan jumlah
 * 2. Buatlah turunan class dari Item: BarangMasuk dan BarangKeluar
 * 3. Buatlah class Transaksi yang menerima BarangMasuk dan BarangKeluar
 * 4. Buatlah class PetugasGudang yang memiliki nama dan transaksi
 * 5. Buatlah fungsi:
 *    - Item -> tampilkan info barang
 *    - Transaksi -> hitung stok akhir (masuk - keluar)
 *    - PetugasGudang -> tampilkan nama petugas dan stok akhir
 *
 * expected result:
 * Nama Petugas = Sari
 * Barang = Botol Plastik
 * Stok Akhir = 120
 */

abstract class Item {
    abstract val name: String
    abstract val quantity: Int

    abstract fun showItem(name: String)
}

class ItemIn(
    override val name: String,
    override val quantity: Int,
) : Item() {
    override fun showItem(name: String) {
        println("Name: $name")
    }
}

class ItemOut(
    override val name: String,
    override val quantity: Int,
) : Item() {
    override fun showItem(name: String) {
        println("Name: $name")
    }
}

class Transactions(
    val itemIn: ItemIn,
    val itemOut: ItemOut,
) {
    fun quantityCount(): Int = itemIn.quantity - itemOut.quantity
}

class Officer(
    val nameOfficer: String,
    val transactions: Transactions,
) {
    fun showOfficer() {
        println("Officer: $nameOfficer")
    }

    fun showLastStock() {
        println("last stock: ${transactions.quantityCount()}")
    }
}

fun main() {
    val newItemIn = ItemIn("Buku", 20)
    val newItemOut = ItemOut("Buku", 10)

    val newTransactions = Transactions(newItemIn, newItemOut)
    val officer = Officer("Raka", newTransactions)
    val item = ItemIn("Baju", 4)
    item.showItem(item.name)

    officer.showOfficer()
    officer.showLastStock()
}
