package com.example.java_spring_to_kotlin.exercice3

data class User(var name: String, var age: Int)

fun main() {
    val user = User("Valentin", 30)

    // 1️⃣ let → uses "it", returns lambda result
    val nameLength = user.let {
        println("User name is ${it.name}")
        it.name.length
    }
    println("Name length: $nameLength")

    // 2️⃣ run → uses "this", returns lambda result
    val isAdult = user.run {
        println("Running with $name")
        age >= 18
    }
    println("Is adult: $isAdult")

    // 3️⃣ apply → uses "this", returns object
    val updatedUser = user.apply {
        name = "Valentin Dumas"
        age = 31
    }
    println("Updated user: $updatedUser")

    // 4️⃣ also → uses "it", returns object
    val loggedUser = user.also {
        println("Logging user: ${it.name}")
    }

    // 5️⃣ with → uses "this", returns lambda result
    val description = with(user) {
        "User $name is $age years old"
    }
    println(description)
}

