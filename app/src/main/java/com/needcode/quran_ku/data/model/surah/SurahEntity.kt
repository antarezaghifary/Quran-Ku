package com.needcode.quran_ku.data.model.surah

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.needcode.quran_ku.domain.model.surah.Surah

@Keep
@Entity
data class SurahEntity(
    val keterangan: String,
    val rukuk: String,
    val nama: String,
    val ayat: Int,
    val urut: String,
    val arti: String,
    val asma: String,
    val audio: String,
    val type: String,
    @PrimaryKey(autoGenerate = false)
    val nomor: String
) {
    fun toSurah(): Surah {
        return Surah(
            keterangan,
            rukuk,
            nama,
            ayat,
            urut,
            arti,
            asma,
            audio,
            type,
            nomor
        )
    }
}