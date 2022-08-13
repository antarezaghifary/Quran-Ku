package com.needcode.quran_ku.domain

import com.needcode.quran_ku.domain.model.surah.Surah
import io.reactivex.Observable

interface QuranUseCase {
    fun getSurah(): Observable<List<Surah>>
}