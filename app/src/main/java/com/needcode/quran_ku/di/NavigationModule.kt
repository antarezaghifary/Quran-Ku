package com.needcode.quran_ku.di

import android.app.Activity
import androidx.navigation.findNavController
import com.needcode.quran_ku.R
import com.needcode.quran_ku.presentation.navigation.MainNavigation
import com.needcode.quran_ku.presentation.navigation.MainNavigationController
import org.koin.dsl.module

val navigationModule = module {
    factory<MainNavigation> { (activity: Activity?) ->
        MainNavigationController(activity?.findNavController(R.id.nav_host_fragment_main))
    }
}