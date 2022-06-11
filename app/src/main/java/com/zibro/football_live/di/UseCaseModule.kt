package com.zibro.football_live.di

import com.zibro.domain.repository.TestRepository
import com.zibro.domain.usecase.GetStatusUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun providesGetUseCase(
        repository : TestRepository
    ) : GetStatusUseCase = GetStatusUseCase(
        repository
    )
}