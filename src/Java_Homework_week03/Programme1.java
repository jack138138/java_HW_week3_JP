package Java_Homework_week03;

import java.util.Scanner;

/**
 * 1. Write a java programme that tells us that input number is odd or even
 * Hint: use ternary operator (? :)
 */

public class Programme1 {
    public static void main(String[] args) {
        Scanner J1 = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = J1.nextInt();
        J1.close();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " number is " + evenOdd);

    }
}
