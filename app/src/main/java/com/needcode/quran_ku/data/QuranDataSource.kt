package com.needcode.quran_ku.data

import com.needcode.quran_ku.data.model.surah.SurahItem
import com.needcode.quran_ku.data.web.QuranApi
import io.reactivex.Single

class QuranDataSource(
    private val webService: QuranApi
) : QuranRepository {
    override fun getSurah(): Single<List<SurahItem>> {
        return webService.getSurah()
    }

}