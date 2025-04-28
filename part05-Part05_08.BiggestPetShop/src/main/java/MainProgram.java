
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet flounder = new Pet("Flounder", "fish");
        Person ariel = new Person("Ariel", flounder);
        System.out.println(ariel.toString());
    }
}
