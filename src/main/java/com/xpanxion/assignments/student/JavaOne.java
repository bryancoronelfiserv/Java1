package com.xpanxion.assignments.student;

import java.util.Random;
import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String nameInUpperCase = name.toUpperCase();
        System.out.println("Your name in upper case is: " + nameInUpperCase);
        scanner.close();
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c))
                count++;
        }
        System.out.println("Number of uppercase letters: " + count);
        scanner.close();
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" "); // Split the input into words

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = words[i].toUpperCase(); // Capitalize every other word
            }
        }

        String result = String.join(" ", words); // Join the words back into a string
        System.out.println(result);
        scanner.close();
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input).reverse();
        String reversedStr = reversed.toString();

        if (input.equalsIgnoreCase(reversedStr))
            System.out.println("YES");
        else
            System.out.println("NO");

        scanner.close();
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string (or 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit"))
                break;

            int vowels = 0;
            int consonants = 0;
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        vowels++;
                    else
                        consonants++;
                }
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        }
        scanner.close();
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
        scanner.close();
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scanner.next();
        double result = 0;

        switch (operation) {
            case "add":
                result = firstNumber + secondNumber;
                break;
            case "sub":
                result = firstNumber - secondNumber;
                break;
            case "mul":
                result = firstNumber * secondNumber;
                break;
            case "div":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);
        scanner.close();
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price per square foot: ");
        double pricePerSquareFoot = scanner.nextDouble();
        double totalCost = 0.0;

        while (true) {
            System.out.print("Enter room dimensions (width x height) or 'done' to finish: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("done"))
                break;

            // Parse room dimensions
            String[] dimensions = input.split("x");
            if (dimensions.length != 2) {
                System.out.println("Invalid input. Please use the format 'width x height'.");
                continue;
            }

            try {
                double width = Double.parseDouble(dimensions[0].trim());
                double height = Double.parseDouble(dimensions[1].trim());

                // Calculate room area and cost
                double roomArea = width * height;
                double roomCost = roomArea * pricePerSquareFoot;
                totalCost += roomCost;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter valid dimensions.");
            }
        }
        System.out.printf("Total cost: $%.2f%n", totalCost);
        scanner.close();
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(5) + 1;
        int userGuess;

        while (true) {
            System.out.print("Enter a number: ");
            userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("You guessed it!!!");
                break;
            }
        }
        scanner.close();
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
