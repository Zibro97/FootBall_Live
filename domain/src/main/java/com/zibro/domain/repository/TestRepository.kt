package com.zibro.domain.repository

import com.zibro.domain.entity.StatusInfo

interface TestRepository {
    suspend fun status() : StatusInfo
}