package com.needcode.quran_ku.utility

object Credential {
    init {
        System.loadLibrary("quran_ku")
    }

    external fun getBaseUrl(): String
}