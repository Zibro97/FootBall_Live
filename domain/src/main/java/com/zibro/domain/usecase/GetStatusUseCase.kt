package com.zibro.domain.usecase

import com.zibro.domain.entity.StatusInfo
import com.zibro.domain.repository.TestRepository

class GetStatusUseCase (
    private val testRepository: TestRepository
) {
    suspend operator fun invoke() : StatusInfo = testRepository.status()
}