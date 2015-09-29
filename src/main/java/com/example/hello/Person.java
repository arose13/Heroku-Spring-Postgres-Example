package com.example.hello;

import javax.persistence.*;

/**
 * This the Database Object itself that will mimic the database structure.
 * Therefore an ID is required for every Entity you intent to create.
 */

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    protected Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}