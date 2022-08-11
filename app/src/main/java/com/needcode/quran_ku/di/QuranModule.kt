package com.needcode.quran_ku.di

import com.needcode.quran_ku.data.QuranDataSource
import com.needcode.quran_ku.data.QuranRepository
import com.needcode.quran_ku.data.web.QuranApi
import com.needcode.quran_ku.domain.QuranInteractor
import com.needcode.quran_ku.domain.QuranUseCase
import com.needcode.quran_ku.presentation.menu.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val quranModule = module {
    single { QuranApi(get()) }
    single<QuranRepository> { QuranDataSource(get()) }
    single<QuranUseCase> { QuranInteractor(get()) }

    viewModel { MainViewModel(get()) }
}