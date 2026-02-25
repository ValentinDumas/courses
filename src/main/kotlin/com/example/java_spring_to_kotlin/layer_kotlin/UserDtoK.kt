package com.example.java_spring_to_kotlin.layer_kotlin

class UserDtoK(val name: String, private val isActive: Boolean) {
    fun isActive(): Boolean {
        return true
    }
}
