package com.morph.mbmgerman.service

import com.morph.mbmgerman.db.WordRepository
import com.morph.mbmgerman.db.entity.Word
import org.springframework.stereotype.Service

@Service
class WordService(private val repository: WordRepository) {
    fun save(word: Word): Word = repository.save(word)
}