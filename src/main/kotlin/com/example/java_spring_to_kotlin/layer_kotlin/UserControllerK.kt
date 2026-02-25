package com.example.java_spring_to_kotlin.layer_kotlin

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users/kotlin")
class UserControllerK(private val userServiceK: UserServiceK) {

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long?): ResponseEntity<UserDtoK> {
        return ResponseEntity.ok(userServiceK.find(id))
    }
}
