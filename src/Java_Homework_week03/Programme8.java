package Java_Homework_week03;
import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {

    public static void main(String[] args) {
        Scanner g1 = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F : ");
        char city = g1.next().charAt(0);
        Programme8 cityName = new Programme8();
        cityName.printCityName(city);
        g1.close();
    }

    public void printCityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Amsterdam");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Birmingham");
        } else if (city == 'C' || city == 'c') {
            System.out.println("chicago");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Delhi");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Florence");
        } else {
            System.out.println("The Alphabet you have entered is not between A to F ");
        }
    }

}

