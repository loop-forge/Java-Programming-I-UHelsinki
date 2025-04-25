
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        Integer days = Integer.valueOf(scanner.nextLine());
        Integer daysInSeconds = days * 24 * 3600;
        System.out.println(daysInSeconds);
    }
}
