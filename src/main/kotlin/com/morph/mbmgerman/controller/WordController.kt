package com.morph.mbmgerman.controller

import com.morph.mbmgerman.db.entity.Word
import com.morph.mbmgerman.service.WordService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = ["http://localhost:4200"])
class WordController(private val service: WordService) {
    @PostMapping("/words")
    fun save(@RequestBody word: Word): Word = service.save(word)

    @GetMapping("/words")
    fun getAll(): List<Word> = service.getAll()
}