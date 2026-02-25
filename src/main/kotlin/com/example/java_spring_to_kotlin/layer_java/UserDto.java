package com.example.java_spring_to_kotlin.layer_java;

public class UserDto {
    private final String name;

    private final boolean isActive;

    public UserDto(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public boolean isActive() {
        return true;
    }

    public String getName() {
        return name;
    }
}
