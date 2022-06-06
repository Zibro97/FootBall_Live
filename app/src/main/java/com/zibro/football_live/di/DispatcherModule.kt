package com.zibro.football_live.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * InstallIn : 주석을 통해 각 모듈을 사용하거나 설치할 Android 클래스를 Hilt에 알리는 Annotation
 * */
@Module
@InstallIn(SingletonComponent::class)
object DispatcherModule {
    @DefaultDispatcher
    @Provides
    fun providesDefaultDispatcher() : CoroutineDispatcher = Dispatchers.Default

    @IODispatcher
    @Provides
    fun providesIODispatcher() : CoroutineDispatcher = Dispatchers.IO

    @MainDispatcher
    @Provides
    fun providesMainDispatcher() : CoroutineDispatcher = Dispatchers.Main
}