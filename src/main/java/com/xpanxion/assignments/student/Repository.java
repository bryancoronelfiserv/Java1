package com.xpanxion.assignments.student;

public class Repository implements DataAccess {
    @Override
    public Person getPerson() {
        // Create and return a Person object with id 1 and name John Doe
        return new Person(1, "John", "Doe");
    }
}