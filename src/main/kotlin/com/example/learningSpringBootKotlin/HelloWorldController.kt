package com.example.learningSpringBootKotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/")
    fun getHello() :String {
        return "Hello World"
    }
}