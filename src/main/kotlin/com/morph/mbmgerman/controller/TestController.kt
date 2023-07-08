package com.morph.mbmgerman.controller

import com.morph.mbmgerman.db.entity.Test
import com.morph.mbmgerman.service.TestService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("test")
@CrossOrigin(origins = ["http://localhost:4200"])
class TestController(private val service: TestService) {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World!"
    }

    @PostMapping("/tests")
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody test: Test): Test = service.create(test)

    @GetMapping("/tests")
    fun getAll(): List<Test> = service.getAll()
}