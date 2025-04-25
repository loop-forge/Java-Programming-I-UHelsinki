
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        try {
            System.out.println(scanner.nextLine());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("err : " + e);
        }

    }
}
