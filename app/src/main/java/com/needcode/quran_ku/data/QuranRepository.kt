package com.needcode.quran_ku.data

import com.needcode.quran_ku.data.model.surah.SurahItem
import io.reactivex.Single

interface QuranRepository {
    fun getSurah(): Single<List<SurahItem>>
}