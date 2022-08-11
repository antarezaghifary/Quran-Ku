package com.needcode.quran_ku

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.needcode.quran_ku.di.navigationModule
import com.needcode.quran_ku.di.networkModule
import com.needcode.quran_ku.di.quranModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class QuranApp : Application() {
    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        startKoin {
            androidContext(this@QuranApp)
            modules(
                networkModule,
                navigationModule,
                quranModule
            )
        }
    }
}