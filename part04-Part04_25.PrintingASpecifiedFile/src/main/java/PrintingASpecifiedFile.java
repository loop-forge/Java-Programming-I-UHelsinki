
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        String fileName = "";

        try(Scanner scanner = new Scanner(System.in)) {
            fileName = scanner.nextLine();
        } catch(Exception e) {
            System.out.println("Error >" + e);
        }

        if(!fileName.equals("")){
            try(Scanner scanPath = new Scanner(Paths.get(fileName))) { 
                while(scanPath.hasNextLine()){
                    System.out.println(scanPath.nextLine());
                }
            } catch (Exception e) {
                System.out.println("Error > " + e);
            } 
        }

    }
}
