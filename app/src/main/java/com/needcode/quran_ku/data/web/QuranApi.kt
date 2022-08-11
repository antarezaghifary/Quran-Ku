package com.needcode.quran_ku.data.web

import com.needcode.quran_ku.data.model.surah.SurahItem
import io.reactivex.Single

class QuranApi(
    private val api: QuranApiClient
) : QuranApiClient {
    override fun getSurah(): Single<List<SurahItem>> {
        return api.getSurah()
    }
}