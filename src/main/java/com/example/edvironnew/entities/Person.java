package com.example.edvironnew.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;

    // Constructors, getters, and setters

    // toString() method for debugging and logging
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}