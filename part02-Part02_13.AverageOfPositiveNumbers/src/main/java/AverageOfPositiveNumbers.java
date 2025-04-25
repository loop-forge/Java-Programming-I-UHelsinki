
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double inputs = 0;
        double average = 0;

        while(true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            
            if (input > 0) {
                sum += input;
                inputs++;
            } else if (input == 0) {
                break;
            } else if (input < 0) {
                continue;
            }
        }

        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else if (sum >= 0 && inputs >= 1) {
            average = (sum / inputs);
            System.out.println(average);
        }
    }
}
