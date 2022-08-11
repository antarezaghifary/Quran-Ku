package com.needcode.quran_ku.domain

import com.needcode.quran_ku.domain.model.surah.Surah
import io.reactivex.Single

interface QuranUseCase {
    fun getSurah(): Single<List<Surah>>
}