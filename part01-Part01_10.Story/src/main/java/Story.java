
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\r\n" + 
                        "What is the main character called?");

        String character = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();

        System.out.println("Here is the story:\r\n" + 
            "Once upon a time there was " + character + ", who was " + job + ".\r\n" +
            "On the way to work, " + character + " reflected on life.\r\n" + 
            "Perhaps " + character + " will not be " + job + " forever."
        );
    }
}
