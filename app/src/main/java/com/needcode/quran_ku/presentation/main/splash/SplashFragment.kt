package com.needcode.quran_ku.presentation.main.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.needcode.quran_ku.databinding.FragmentSplashBinding
import com.oratakashi.viewbinding.core.binding.fragment.viewBinding

class SplashFragment : Fragment() {

    private val binding: FragmentSplashBinding by viewBinding()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

}