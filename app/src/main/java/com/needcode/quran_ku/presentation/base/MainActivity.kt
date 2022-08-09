package com.needcode.quran_ku.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.needcode.quran_ku.databinding.ActivityMainBinding
import com.oratakashi.viewbinding.core.binding.activity.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(binding) {

        }
    }
}