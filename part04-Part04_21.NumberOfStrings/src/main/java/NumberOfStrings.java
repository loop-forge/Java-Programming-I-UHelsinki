
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String string = scanner.nextLine();
            if(string.equals("end")){ 
                list.add(string);
                break ; 
            }
            list.add(string);
        }

        System.out.println(list.size()-1);
    }
}
