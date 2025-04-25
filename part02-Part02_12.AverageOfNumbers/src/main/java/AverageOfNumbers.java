
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double inputs = 0;
        double average = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            
            if (input != 0) {
                sum += input;
                inputs++;
            } else if (input == 0) {
                break;
            }
        }
        
        System.out.println("inputs > " + inputs);
        System.out.println("sum > " + sum);

        if (inputs >= 1) {
            average = (sum / inputs);
        }
        System.out.println("Average of the numbers: " + average);
    }
}
