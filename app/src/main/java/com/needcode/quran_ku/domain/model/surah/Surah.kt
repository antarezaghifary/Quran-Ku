package com.needcode.quran_ku.domain.model.surah

data class Surah(
    val keterangan: String,
    val rukuk: String,
    val nama: String,
    val ayat: Int,
    val urut: String,
    val arti: String,
    val asma: String,
    val audio: String,
    val type: String,
    val nomor: String
)