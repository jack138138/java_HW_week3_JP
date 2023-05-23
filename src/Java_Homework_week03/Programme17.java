package Java_Homework_week03;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {


        public static void main(String[] args) {
            // Numeric array sorting
            int[] numbers = {5, 2, 8, 1, 9, 4};
            System.out.println("Original numeric array: " + Arrays.toString(numbers));
            Arrays.sort(numbers);
            System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

            // String array sorting
            String[] names = {"Jaydeep", "Alisha", "Bobby", "Ramcharan", "vidyut"};
            System.out.println("Original string array: " + Arrays.toString(names));
            Arrays.sort(names);
            System.out.println("Sorted string array: " + Arrays.toString(names));
        }
    }

