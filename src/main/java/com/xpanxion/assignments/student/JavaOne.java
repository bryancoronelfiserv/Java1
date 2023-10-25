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
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
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
