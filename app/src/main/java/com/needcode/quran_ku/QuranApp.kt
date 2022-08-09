package com.needcode.quran_ku

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class QuranApp : Application() {
    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}