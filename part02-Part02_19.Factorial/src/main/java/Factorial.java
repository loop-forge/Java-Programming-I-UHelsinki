
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number? ");
        int i = Integer.valueOf(scanner.nextLine());
       
        int sum = 1;

        for(int j = 1; j <= i; j++) {
            sum *= j;
        }

        System.out.println("Factorial: " + sum);
    }
}
