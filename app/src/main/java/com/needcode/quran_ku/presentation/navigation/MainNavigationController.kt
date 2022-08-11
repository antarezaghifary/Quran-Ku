package com.needcode.quran_ku.presentation.navigation

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.needcode.quran_ku.R
import com.needcode.quran_ku.domain.model.surah.Surah
import com.needcode.quran_ku.presentation.menu.main.MainFragmentDirections
import com.needcode.quran_ku.presentation.menu.splash.SplashFragmentDirections
import com.needcode.quran_ku.utility.getDefaultNavOptions

class MainNavigationController(
    private val navController: NavController?
) : MainNavigation {
    override fun goMain() {
        runCatching {
            navController?.navigate(
                SplashFragmentDirections.actionSplashFragmentToMainFragment()
            )
        }.onFailure {
            it.printStackTrace()
            navController?.navigate(R.id.mainFragment, null, getDefaultNavOptions())
        }
    }

    override fun toDetail(surah: Surah) {
        runCatching {
            navController?.navigate(
                MainFragmentDirections.actionMainFragmentToDetailFragment(surah)
            )
        }.onFailure {
            it.printStackTrace()
            navController?.navigate(
                R.id.detailFragment,
                bundleOf("data" to surah),
                getDefaultNavOptions()
            )
        }
    }
}