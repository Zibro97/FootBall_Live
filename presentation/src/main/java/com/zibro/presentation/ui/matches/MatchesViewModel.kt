package com.zibro.presentation.ui.matches

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zibro.domain.entity.StatusInfo
import com.zibro.domain.usecase.GetStatusUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MatchesViewModel @Inject constructor(
    private val getStatusUseCase: GetStatusUseCase
) : ViewModel() {
    private val _statusLiveData : MutableLiveData<StatusInfo> = MutableLiveData()
    val statusLiveData : LiveData<StatusInfo> = _statusLiveData

    fun getStatus() {
        viewModelScope.launch {
            _statusLiveData.value = getStatusUseCase.invoke()
        }
    }
}