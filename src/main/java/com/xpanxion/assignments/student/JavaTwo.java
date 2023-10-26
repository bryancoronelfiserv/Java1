package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.text.NumberFormat;
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

    public static void ex12() {
        HashMap<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, "Peter", "Jones"));
        personMap.put(2, new Person(2, "John", "Smith"));
        personMap.put(3, new Person(3, "Mary", "Jane"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Person ID (or 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int personId = Integer.parseInt(input);
                Person person = personMap.get(personId);

                if (person != null) {
                    System.out.println(person);
                } else {
                    System.out.println("Person with ID " + personId + " not found.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid person ID.");
            }
        }
        scanner.close();
    }

    public static void ex13() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
}
