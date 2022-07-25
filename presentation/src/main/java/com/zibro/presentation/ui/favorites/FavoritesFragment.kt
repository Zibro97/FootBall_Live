package com.zibro.presentation.ui.favorites

import androidx.fragment.app.viewModels
import com.zibro.presentation.R
import com.zibro.presentation.base.BaseFragment
import com.zibro.presentation.databinding.FragmentFavoritesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoritesFragment : BaseFragment<FragmentFavoritesBinding,FavoriteViewModel>(R.layout.fragment_favorites) {
    override val viewModel by viewModels<FavoriteViewModel>()

    override fun observeData() = Unit
}