package Java_Homework_week03;
/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above
 *
 */

public class Programme4 {

        public static void main(String[] args) {
            System.out.println(isLeapYear(-1600)); // false
            System.out.println(isLeapYear(1600)); // true
            System.out.println(isLeapYear(2017)); // false
            System.out.println(isLeapYear(2000)); // true

            System.out.println(getDaysInMonth(1, 2020)); // 31
            System.out.println(getDaysInMonth(2, 2020)); // 29
            System.out.println(getDaysInMonth(2, 2018)); // 28
            System.out.println(getDaysInMonth(-1, 2020)); // -1
            System.out.println(getDaysInMonth(1, -2020)); // -1
        }

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static int getDaysInMonth(int month, int year) {
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }

            int daysInMonth;
            switch (month) {
                case 2:
                    daysInMonth = isLeapYear(year) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
                    break;
            }

            return daysInMonth;
        }
    }

