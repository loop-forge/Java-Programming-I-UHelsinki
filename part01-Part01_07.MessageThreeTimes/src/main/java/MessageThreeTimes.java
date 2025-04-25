
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        
        String message = scanner.nextLine();
        while (i < 3) {
            System.out.println(message);
            i++;
        }
    }
}
