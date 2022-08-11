package com.needcode.quran_ku.domain

import com.needcode.quran_ku.data.QuranRepository
import com.needcode.quran_ku.domain.model.surah.Surah
import io.reactivex.Single

class QuranInteractor(
    private val repo: QuranRepository
) : QuranUseCase {
    override fun getSurah(): Single<List<Surah>> {
        return repo.getSurah().map { it.map { data -> data.toSurah() } }
    }
}