package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Scanner;

class Calculator {
    private ArrayList<String> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            String input = scanner.nextLine();

            if (input.equals("done")) {
                displayHistory();
                break;
            }

            try {
                double firstNumber = Double.parseDouble(input);
                System.out.print("Enter second number: ");
                double secondNumber = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter operation (add, sub, mul, div): ");
                String operation = scanner.nextLine();

                double result;
                String historyEntry;

                switch (operation) {
                    case "add":
                        result = firstNumber + secondNumber;
                        historyEntry = firstNumber + " + " + secondNumber + " = " + result;
                        break;
                    case "sub":
                        result = firstNumber - secondNumber;
                        historyEntry = firstNumber + " - " + secondNumber + " = " + result;
                        break;
                    case "mul":
                        result = firstNumber * secondNumber;
                        historyEntry = firstNumber + " * " + secondNumber + " = " + result;
                        break;
                    case "div":
                        if (secondNumber == 0) {
                            System.out.println("Division by zero is not allowed.");
                            continue;
                        }
                        result = firstNumber / secondNumber;
                        historyEntry = firstNumber + " / " + secondNumber + " = " + result;
                        break;
                    default:
                        System.out.println("Invalid operation. Please use 'add', 'sub', 'mul', or 'div'.");
                        continue;
                }

                history.add(historyEntry);
                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        scanner.close();
    }

    private void displayHistory() {
        for (String entry : history) {
            System.out.println(entry);
        }
    }
}

