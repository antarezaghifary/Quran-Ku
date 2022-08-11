package com.needcode.quran_ku.utility

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.immutable() = this as LiveData<T>