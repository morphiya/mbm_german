package com.morph.mbmgerman.controller

import com.morph.mbmgerman.db.entity.Test
import com.morph.mbmgerman.service.TestService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("test")
class TestController(private val service: TestService) {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World!"
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody test: Test): Test = service.create(test)
}