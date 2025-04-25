
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = (year % 4 == 0 ? true : false);

        boolean isDivisibleBy100 = (year % 100 == 0 ? true : false);
        boolean isDivisibleBy400 = (year % 400 == 0 ? true : false);

        if(isDivisibleBy4) {
            if (!isDivisibleBy100) {
                isLeapYear = true;
            }

            if (isDivisibleBy100) {
                if(isDivisibleBy400) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }
        }

        if(isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
