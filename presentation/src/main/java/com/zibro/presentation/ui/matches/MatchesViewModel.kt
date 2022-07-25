package com.zibro.presentation.ui.matches

import com.zibro.domain.usecase.GetStatusUseCase
import com.zibro.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MatchesViewModel @Inject constructor(
    private val getStatusUseCase: GetStatusUseCase
) : BaseViewModel() {
//    private val _statusLiveData : MutableLiveData<StatusInfo> = MutableLiveData()
//    val statusLiveData : LiveData<StatusInfo> = _statusLiveData
//
//    fun getStatus() {
//        viewModelScope.launch {
//            _statusLiveData.value = getStatusUseCase.invoke()
//        }
//    }
}