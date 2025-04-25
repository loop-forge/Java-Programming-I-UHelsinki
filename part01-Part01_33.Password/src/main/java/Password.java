
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String passwd = scan.nextLine();
        boolean validPassword = passwd.equals("Caput Draconis");
        if (validPassword) { 
            System.out.println("Welcome!");
        } else if (!validPassword) {
            System.out.println("Off with you!");
        }
    }
}
