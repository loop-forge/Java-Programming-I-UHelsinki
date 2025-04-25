
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int i = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for(int j = 0; j <= i; j++) {
            sum += j;
        }

        System.out.println("The sum is " + sum);
    }
}
