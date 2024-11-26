package calculator_game;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;
        System.out.println("Welcome to the Calculator Game!");
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        while (true) {
            System.out.print("Enter an operator (+, -, *, /, = to exit): ");
            operator = input.next().charAt(0);

            if (operator == '=') {
                System.out.println("Final result: " + num1);
                break;
            }

            System.out.print("Enter the second number: ");
            num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        continue; // Skip updating num1
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    continue; // Skip updating num1
            }

            System.out.println("Result: " + result);
            num1 = result; // Update num1 with the result for the next operation
        }

        input.close();
    }
}
