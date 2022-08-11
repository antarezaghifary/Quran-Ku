package com.needcode.quran_ku.data.web

import com.needcode.quran_ku.data.model.surah.SurahItem
import io.reactivex.Single
import retrofit2.http.GET

interface QuranApiClient {
    @GET("data")
    fun getSurah(): Single<List<SurahItem>>
}