package com.needcode.quran_ku.di

import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.chuckerteam.chucker.api.RetentionManager
import com.needcode.quran_ku.BuildConfig
import com.needcode.quran_ku.data.web.QuranApiClient
import com.needcode.quran_ku.utility.Credential
import com.oratakashi.viewbinding.core.tools.retrofit.createOkHttpClient
import com.oratakashi.viewbinding.core.tools.retrofit.createReactiveService
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val networkModule = module {
    single {
        ChuckerCollector(
            context = androidContext(),
            showNotification = BuildConfig.DEBUG,
            retentionPeriod = RetentionManager.Period.ONE_DAY
        )
    }

    single {
        ChuckerInterceptor.Builder(androidContext())
            .apply {
                collector(get())
                maxContentLength(250_000L)
                alwaysReadResponseBody(false)
            }
            .build()
    }

    //Custom

    single {
        createOkHttpClient(
            arrayOf(
                get<ChuckerInterceptor>()
            ),
            null,
            null,
            BuildConfig.DEBUG
        )
    }

    single {
        createReactiveService(
            QuranApiClient::class.java,
            get(),
            Credential.getBaseUrl()
        )
    }
}