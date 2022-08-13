package com.needcode.quran_ku.data

import com.needcode.quran_ku.data.model.surah.SurahEntity
import io.reactivex.Observable

interface QuranRepository {
    fun getSurah(): Observable<List<SurahEntity>>

}