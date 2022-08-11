package com.needcode.quran_ku.utility

import androidx.lifecycle.LiveData

fun <T> MutableList<T>.immutable() = this as LiveData<T>