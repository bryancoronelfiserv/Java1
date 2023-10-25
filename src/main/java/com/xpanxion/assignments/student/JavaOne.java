package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

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
            if (Character.isUpperCase(c)) count++;
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

        if (input.equalsIgnoreCase(reversedStr)) System.out.println("YES");
        else System.out.println("NO");

        scanner.close();
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string (or 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) break;

            int vowels = 0;
            int consonants = 0;
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
                    else consonants++;
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
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
