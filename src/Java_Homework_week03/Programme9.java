package Java_Homework_week03;

import java.util.Scanner;
/**
 * Same as above program-8 using switch statement.
 */
public class Programme9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        String alphabet = scanner.next().toUpperCase();

        String cityName;

        switch (alphabet) {
            case "A":
                cityName = "Amsterdam";
                break;
            case "B":
                cityName = "Birmingham";
                break;
            case "C":
                cityName = "Chicago";
                break;
            case "D":
                cityName = "Delhi";
                break;
            case "E":
                cityName = "Edinburgh";
                break;
            case "F":
                cityName = "Florence";
                break;
            default:
                cityName = "Invalid entry";
                break;
        }

        System.out.println("City name: " + cityName);
    }
}
