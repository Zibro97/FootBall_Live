package com.zibro.football_live.di

import com.zibro.data.repository.TestRepositoryImpl
import com.zibro.domain.repository.TestRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Binds : 하나의 객체를 변수로 받아 해당 변수를 생성하고 프로퍼티, 메서드까지 @Inject가 붙은 모든 주입을 처리하고 나서 반환하는 Annotation
 * */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindTestRepository(
        testRepositoryImpl: TestRepositoryImpl
    ) : TestRepository
}