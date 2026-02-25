package com.example.java_spring_to_kotlin

import java.util.concurrent.Callable

class CallableService(
    private val callable: Callable<String>
) {
    fun execute(): String {
        return callable.call()
    }
}