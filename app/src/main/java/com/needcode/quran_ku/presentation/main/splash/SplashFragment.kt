package com.needcode.quran_ku.presentation.main.splash

import androidx.lifecycle.lifecycleScope
import com.needcode.quran_ku.databinding.FragmentSplashBinding
import com.needcode.quran_ku.presentation.abstraction.BaseFragment
import com.needcode.quran_ku.presentation.navigation.MainNavigation
import com.needcode.quran_ku.utility.navigation
import com.oratakashi.viewbinding.core.binding.fragment.viewBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override val binding: FragmentSplashBinding by viewBinding()

    private val navigation: MainNavigation by navigation { activity }

    override fun initAction() {
        super.initAction()
        lifecycleScope.launch {
            delay(2000)
            navigation.goMain()
        }
    }
}