package com.needcode.quran_ku.di

import com.needcode.quran_ku.data.db.QuranDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single {
        QuranDatabase.getAppDatabase(androidContext())
    }

    single { get<QuranDatabase>().surah() }
}