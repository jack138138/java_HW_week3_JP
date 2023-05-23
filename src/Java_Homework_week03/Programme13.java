package Java_Homework_week03;
import java.util.Scanner;
/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13 {



         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (1-7): ");
            int number = scanner.nextInt();

            String day;

            switch (number) {
                case 1:
                    day = "MONDAY";
                    break;
                case 2:
                    day = "TUESDAY";
                    break;
                case 3:
                    day = "WEDNESDAY";
                    break;
                case 4:
                    day = "THURSDAY";
                    break;
                case 5:
                    day = "FRIDAY";
                    break;
                case 6:
                    day = "SATURDAY";
                    break;
                case 7:
                    day = "SUNDAY";
                    break;
                default:
                    day = "Week contains 1 to 7 days";
                    break;
            }

            System.out.println("Day of the week: " + day);
        }
    }

