package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger ;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger =  LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        logger.info("Started");
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                logger.info("Byee Execution over");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please choose a valid option.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    logger.info("add completed");
                    break;
                case 2:
                    result = subtract(num1, num2);
                    logger.info("subtract completed");
                    break;
                case 3:
                    result = multiply(num1, num2);
                    logger.info("multiply completed");
                    break;
                case 4:
                    result = divide(num1, num2);
                    logger.info("divide completed");
                    break;
            }

            System.out.println("Result: " + result);
        }
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            logger.warn("Division by 0 error");
            return 0;
        }
    }
}




