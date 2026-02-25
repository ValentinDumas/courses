package com.example.java_spring_to_kotlin.exercice2;

import com.example.java_spring_to_kotlin.layer_java.UserDto;

import java.util.List;
import java.util.stream.Collectors;


public class ConvertStreamKotlin {
    public List<String> getActiveNames(List<UserDto> users) {
        return users.stream()
                .filter(UserDto::isActive)
                .map(UserDto::getName)
                .collect(Collectors.toList());
    }
}
