package com.needcode.quran_ku.data

import com.needcode.quran_ku.data.db.SurahDao
import com.needcode.quran_ku.data.model.surah.SurahEntity
import com.needcode.quran_ku.data.web.QuranApi
import com.oratakashi.viewbinding.core.network.networkSync
import io.reactivex.Observable

class QuranDataSource(
    private val webService: QuranApi,
    private val dbSurah: SurahDao
) : QuranRepository {
    override fun getSurah(): Observable<List<SurahEntity>> {
        return networkSync(
            saveToDb = { dbSurah.insertAll(it) },
            fetchDb = { dbSurah.getAll() },
            fetchApi = { webService.getSurah() },
            //_ diubah jadi dbSurah
            onConflict = { api, db ->
                api.filter { !db.contains(it.toSurahEntity()) }.map {
                    it.toSurahEntity()
                }
                //api.map { it.toSurahEntity() }
            },
            alwaysUpToDate = { true }
        )
    }
}