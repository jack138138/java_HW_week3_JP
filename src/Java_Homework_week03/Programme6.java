package Java_Homework_week03;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {




        public static void main(String[] args) {
            Scanner J1 = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = J1.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
            J1.close();
        }

    }

