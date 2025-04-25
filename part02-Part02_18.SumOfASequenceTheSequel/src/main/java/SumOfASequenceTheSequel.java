
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int k = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for(int j = i; j <= k; j++) {
            sum += j;
        }

        System.out.println("The sum is " + sum);
    }
}
