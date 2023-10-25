package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaTwo {

    public void ex1() {
        System.out.println("Student 1: ex1.");

        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        int id = 1;
        while (true) {
            System.out.print("Enter Person (or 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] parts = input.split(", ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please use the format 'ID, FirstName LastName'.");
                continue;
            }

            String fullName = parts[1];
            String[] nameParts = fullName.split(" ");

            if (nameParts.length != 2) {
                System.out.println("Invalid name format. Please provide both first and last name.");
                continue;
            }

            String firstName = nameParts[0];
            String lastName = nameParts[1];

            Person person = new Person(id, firstName, lastName);
            people.add(person);
            id++;
        }

        for (Person person : people) {
            System.out.println(person);
        }

        scanner.close();
    }
}
