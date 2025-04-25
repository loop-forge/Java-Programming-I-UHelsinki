
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            try(Scanner scan = new Scanner(Paths.get("../../../names.txt"))){
                while(scan.hasNextLine()){
                    if (scan.nextLine().equals(name)) {
                        System.out.println("The name is on the list.");
                    } else {
                        System.out.println("The name is not on the list.");
        
                    }
                    System.out.println(scan.nextLine());
                }
            } catch(Exception e){
                System.out.println("Err >" + e);
            }

            
        }

        System.out.println("Thank you!");
    }
}
