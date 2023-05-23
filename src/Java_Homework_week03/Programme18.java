package Java_Homework_week03;

/**
 * Write a Java program to sum values of an array
 */
public class Programme18 {

        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 9, 4};
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            System.out.println("Sum of the array elements: " + sum);
        }
    }


