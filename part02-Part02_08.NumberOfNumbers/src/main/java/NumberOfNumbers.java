
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = 0;

        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input != 0) {
                inputs += 1;
            } else if (input == 0) {
                break;
            }
        }

        System.out.println("Number of numbers: " + inputs);
    }
}
