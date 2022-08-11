package com.needcode.quran_ku.presentation.menu.main

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.needcode.quran_ku.databinding.FragmentMainBinding
import com.needcode.quran_ku.domain.model.surah.Surah
import com.needcode.quran_ku.presentation.abstraction.BaseFragment
import com.needcode.quran_ku.presentation.navigation.MainNavigation
import com.needcode.quran_ku.utility.addObservers
import com.needcode.quran_ku.utility.navigation
import com.oratakashi.viewbinding.core.binding.fragment.viewBinding
import com.oratakashi.viewbinding.core.tools.showDefaultLayout
import com.oratakashi.viewbinding.core.tools.showLoadingLayout
import com.oratakashi.viewbinding.core.tools.toast
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding>(), MainDataContract {
    override val binding: FragmentMainBinding by viewBinding()
    private val viewModel: MainViewModel by viewModel()
    private val nav: MainNavigation by navigation { activity }
    private val surahAdapter: SurahAdapter by lazy {
        SurahAdapter {
            nav.toDetail(it)
        }
    }

    override fun initUI() {
        super.initUI()
        with(binding) {
            rvSurah.apply {
                adapter = surahAdapter
                addItemDecoration(
                    DividerItemDecoration(
                        requireContext(),
                        LinearLayoutManager.VERTICAL
                    )
                )
            }
        }
    }

    override fun initAction() {
        super.initAction()
        viewModel.getSurah()
    }

    override fun initObserver() {
        super.initObserver()
        addObservers(MainObserver(viewModel, this))
    }

    override fun onLoadingSurah() {
        binding.msvSurah.showLoadingLayout()
    }

    override fun onSuccessSurah(data: List<Surah>) {
        with(binding) {
            msvSurah.showDefaultLayout()
            surahAdapter.addAll(data)
        }
    }

    override fun onFailSurah(error: Throwable?) {
        error?.printStackTrace()
        toast(error?.message.orEmpty())
    }


}