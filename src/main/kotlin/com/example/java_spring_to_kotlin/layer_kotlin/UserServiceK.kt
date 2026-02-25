package com.example.java_spring_to_kotlin.layer_kotlin

import org.springframework.stereotype.Service

@Service
class UserServiceK {
    fun find(id: Long?): UserDtoK? {
        val u  = UserDtoK("U", isActive = true)
        print(u)
        return null
    }
}
