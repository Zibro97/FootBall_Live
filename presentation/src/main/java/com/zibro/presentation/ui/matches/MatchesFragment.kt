package com.zibro.presentation.ui.matches

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.zibro.presentation.R
import com.zibro.presentation.base.BaseFragment
import com.zibro.presentation.databinding.FragmentMatchesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MatchesFragment : BaseFragment<FragmentMatchesBinding>(R.layout.fragment_matches) {

    private val viewModel : MatchesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModelTest = viewModel
    }
}