package com.zibro.presentation.ui.menu

import androidx.fragment.app.viewModels
import com.zibro.presentation.R
import com.zibro.presentation.base.BaseFragment
import com.zibro.presentation.databinding.FragmentMenuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MenuFragment : BaseFragment<FragmentMenuBinding,MenuViewModel>(R.layout.fragment_menu) {
    override val viewModel by viewModels<MenuViewModel>()

    override fun observeData() = Unit

}