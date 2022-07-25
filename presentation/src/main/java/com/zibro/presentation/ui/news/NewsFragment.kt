package com.zibro.presentation.ui.news

import androidx.fragment.app.viewModels
import com.zibro.presentation.R
import com.zibro.presentation.base.BaseFragment
import com.zibro.presentation.databinding.FragmentNewsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsFragment : BaseFragment<FragmentNewsBinding,NewsViewModel>(R.layout.fragment_news) {
    override val viewModel by viewModels<NewsViewModel>()

    override fun observeData() = Unit
}