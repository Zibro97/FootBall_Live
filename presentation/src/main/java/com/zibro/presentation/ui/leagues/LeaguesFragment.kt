package com.zibro.presentation.ui.leagues

import androidx.fragment.app.viewModels
import com.zibro.presentation.R
import com.zibro.presentation.base.BaseFragment
import com.zibro.presentation.databinding.FragmentLeaguesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LeaguesFragment : BaseFragment<FragmentLeaguesBinding,LeaguesViewModel>(R.layout.fragment_leagues) {
    override val viewModel by viewModels<LeaguesViewModel>()

    override fun observeData() = Unit

}