package com.example.java_spring_to_kotlin.exercice2.solution

import com.example.java_spring_to_kotlin.layer_java.UserDto

class ConvertStreamKotlinSolution {
    fun getActiveNames(users: List<UserDto>): List<String> {
        return users.stream()
            .filter { obj: UserDto -> obj.isActive }
            .map { obj: UserDto -> obj.name }
            .toList()
    }
}
