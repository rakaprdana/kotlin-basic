package com.example.fastcampus

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}

fun main() {
    val secretNumber = Random.nextInt(1, 101) // Angka acak antara 1 dan 100 (inklusif)
    var attempts = 0
    var guessedCorrectly = false

    println("Selamat datang di Game Tebak Angka!")
    println("Saya telah memilih angka antara 1 dan 100.")
    println("Coba tebak angka tersebut!")

    while (!guessedCorrectly) {
        print("Masukkan tebakanmu: ")
        val guessString = readLine()

        if (guessString == null) {
            println("Input tidak valid. Silakan coba lagi.")
            continue // Lanjutkan ke iterasi berikutnya jika input null
        }

        val guess = guessString.toIntOrNull()

        if (guess == null) {
            println("Input tidak valid. Harap masukkan angka.")
            continue
        }

        attempts++

        when {
            guess < secretNumber -> println("Terlalu rendah! Coba lagi.")
            guess > secretNumber -> println("Terlalu tinggi! Coba lagi.")
            else -> {
                guessedCorrectly = true
                println("Selamat! Kamu menebak angka dengan benar ($secretNumber) dalam $attempts percobaan.")
            }
        }
    }
    println("Terima kasih telah bermain!")
}
