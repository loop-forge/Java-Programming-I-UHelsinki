
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        boolean isValidAge = (age >= 0) && (age <= 120);
        if (isValidAge) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
