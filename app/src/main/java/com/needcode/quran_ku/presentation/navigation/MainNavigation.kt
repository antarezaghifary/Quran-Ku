package com.needcode.quran_ku.presentation.navigation

import com.needcode.quran_ku.domain.model.surah.Surah

interface MainNavigation {
    fun goMain()
    fun toDetail(surah: Surah)
}