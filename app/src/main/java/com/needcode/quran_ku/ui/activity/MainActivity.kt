package com.needcode.quran_ku.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.needcode.quran_ku.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {

        }
    }
}