package Java_Homework_week03;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {

        public static void main(String[] args) {
            int[] numbers = {50, 28, 85, 81, 19, 40};
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            double average = (double) sum / numbers.length;

            System.out.println("Average of the array elements: " + average);
        }
    }

