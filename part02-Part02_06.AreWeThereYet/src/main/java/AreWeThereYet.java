
import java.util.Scanner;

public class AreWeThereYet {
    static int number;  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        } while (number != 4);
    }
}
