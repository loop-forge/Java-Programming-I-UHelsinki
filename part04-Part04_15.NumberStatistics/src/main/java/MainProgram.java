
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        int number = 0;
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        System.out.println("Enter numbers:");

        while(true){
            number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            } else {
                statistics.addNumber(number);
                if (number%2 == 0) {
                    statisticsEven.addNumber(number);
                } else {
                    statisticsOdd.addNumber(number);
                }
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers:: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
    }
}
