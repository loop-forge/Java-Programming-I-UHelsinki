
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String success = "You have successfully logged in!";
        String failed = "Incorrect username or password!";
        String enterUsername = "Enter username: ";
        String enterPassword = "Enter username: ";

        System.out.print(enterUsername);
        String username = scanner.nextLine();

        System.out.println(enterUsername);
        String password = scanner.nextLine();

            if ((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))) {
                System.out.println(success);        
            } else {
                System.out.println(failed);
            }
    }
}
