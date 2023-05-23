package Java_Homework_week03;
import java.util.Scanner;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the symbol (+, -, /, *): ");
        char symbol = scanner.next().charAt(0);

        double result;

        if (symbol == '+') {
            result = num1 + num2;
            System.out.println("Addition: " + result);
        } else if (symbol == '-') {
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else if (symbol == '*') {
            result = num1 * num2;
            System.out.println("Multiplication: " + result);
        } else {
            System.out.println("Invalid symbol.");
        }
    }


}
