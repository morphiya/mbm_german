package com.morph.mbmgerman.controller

import com.morph.mbmgerman.db.entity.Word
import com.morph.mbmgerman.service.WordService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/word")
class WordController(private val service: WordService) {
    @PostMapping("/save")
    fun save(@RequestBody word: Word): Word = service.save(word)
}