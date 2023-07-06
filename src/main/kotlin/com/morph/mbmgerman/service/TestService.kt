package com.morph.mbmgerman.service

import com.morph.mbmgerman.db.TestRepository
import com.morph.mbmgerman.db.entity.Test
import org.springframework.stereotype.Service

@Service
class TestService(private val repository: TestRepository) {
    fun create(test: Test): Test = repository.save(test)
}