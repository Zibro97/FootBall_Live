package com.zibro.data.repository

import com.zibro.data.api.FootballApi
import com.zibro.data.util.IODispatcher
import com.zibro.domain.entity.StatusInfo
import com.zibro.domain.repository.TestRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val footballApi: FootballApi,
    @IODispatcher private val ioDispatcher : CoroutineDispatcher = Dispatchers.IO
) : TestRepository {
    override suspend fun status(): StatusInfo =
        withContext(ioDispatcher){
            footballApi.status()
        }
}