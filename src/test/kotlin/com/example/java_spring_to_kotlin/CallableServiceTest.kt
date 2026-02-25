package com.example.java_spring_to_kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import java.util.concurrent.Callable

class CallableServiceTest {

    // Note: Backticks (``) allow using Java method names that conflict with Kotlin keywords.
    // Note2: Prefer mockito-kotlin for cleaner syntax (ex: whenever instead of `when`)
    @Test
    fun `should return mocked value when callable is executed using mockito when`() {
        // Given
        val callable = Mockito.mock(Callable::class.java) as Callable<String>
        Mockito.`when`(callable.call()).thenReturn("Hello Kotlin")

        val service = CallableService(callable)

        // When
        val result = service.execute()

        // Then
        assertEquals("Hello Kotlin", result)
    }
}