package com.needcode.quran_ku.presentation.menu.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.needcode.quran_ku.domain.QuranUseCase
import com.needcode.quran_ku.domain.model.surah.Surah
import com.needcode.quran_ku.utility.immutable
import com.oratakashi.viewbinding.core.binding.livedata.liveData
import com.oratakashi.viewbinding.core.tools.State
import com.oratakashi.viewbinding.core.tools.retrofit.transformer.composeSingle
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(
    private val useCase: QuranUseCase
) : ViewModel() {
    private val disposable: CompositeDisposable by lazy { CompositeDisposable() }
    private val _surah: MutableLiveData<State<List<Surah>>> by liveData()
    val surah: LiveData<State<List<Surah>>> by lazy { _surah.immutable() }

    fun getSurah() {
        useCase.getSurah()
            .compose(composeSingle())
            .subscribe({
                _surah.postValue(State.success(it))
            }, {
                _surah.postValue(State.fail(it, it.message))
            })
            .let { return@let disposable::add }
    }
}