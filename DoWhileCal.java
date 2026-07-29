package calculator;

import java.util.Scanner;

public class DoWhileCal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter number1: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter number2: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter the operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);

            if (operator == '+') {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator == '/') {
                if (num2 != 0) {
                    System.out.println("Division is: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else if (operator == '%') {
                if (num2 != 0) {
                    System.out.println("Remainder is: " + (num1 % num2));
                } else {
                    System.out.println("Error: Cannot find remainder with zero.");
                }
            } else {
                System.out.println("Invalid operator!");
            }

            System.out.print("Enter 1 to continue or 0 to exit: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Calculator closed.");
        sc.close();
    }
}
