package com.needcode.quran_ku.presentation.menu.main

import com.needcode.quran_ku.domain.model.surah.Surah

interface MainDataContract {
    fun onLoadingSurah()
    fun onSuccessSurah(data: List<Surah>)
    fun onFailSurah(error: Throwable?)
}