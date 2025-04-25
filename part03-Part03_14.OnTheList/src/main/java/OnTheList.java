
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        System.out.print("Search for?");
        String searchFor = scanner.nextLine();
        
        System.out.println(checkIfContains(list, searchFor));
    }

    public static String checkIfContains(ArrayList<String> liste, String input){
        if(liste.contains(input)){
            return input + " was found!";
        } else {
            return input + " was not found!";
        }
    }
}
