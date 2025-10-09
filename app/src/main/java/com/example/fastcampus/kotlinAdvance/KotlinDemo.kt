package com.example.fastcampus.kotlinAdvance

abstract class Bangunan {
    abstract fun getName(): String

    abstract fun getType(): String
}

interface BangunDatar {
    fun hitungLuas(): Int
}

interface BangunRuang {
    fun hitungVolume(): Int
}

class Persegi(
    val sisi: Int,
) : Bangunan(),
    BangunDatar {
    override fun getName(): String = "Persegi"

    override fun getType(): String = "Bangun Datar"

    override fun hitungLuas(): Int = sisi * sisi
}

class Segitigas(
    val alas: Int,
    val tinggi: Int,
) : Bangunan(),
    BangunDatar {
    override fun getName(): String = "Segitiga"

    override fun getType(): String = "Bangun Datar"

    override fun hitungLuas(): Int = alas * tinggi / 2
}

class Kubus(
    val sisi: Int,
) : Bangunan(),
    BangunRuang {
    override fun getName(): String = "Kubus"

    override fun getType(): String = "Bangun Ruang"

    override fun hitungVolume(): Int = sisi * sisi * sisi
}

fun main() {
    val newPersegi = Persegi(5)
    val newSegitiga = Segitigas(4, 2)
    val newKubus = Kubus(2)

    val listOfBangunDatar: List<BangunDatar> = listOf(newPersegi, newSegitiga)
    val listOfBangunRuang: List<BangunRuang> = listOf(newKubus)

    println(listOfBangunDatar)
    println(listOfBangunRuang)
}
