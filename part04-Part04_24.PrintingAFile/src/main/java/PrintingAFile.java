
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        try {
            //Scanner scan = new Scanner(Paths.get("../../../data.txt"));
            Scanner scan = new Scanner(Paths.get("data.txt"));
            while(scan.hasNextLine()){
                String output = scan.nextLine();
                System.out.println(output);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
