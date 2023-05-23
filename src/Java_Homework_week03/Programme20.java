package Java_Homework_week03;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4};
        int targetValue = 8;
        boolean containsValue = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                containsValue = true;
                break;
            }
        }

        if (containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }

}