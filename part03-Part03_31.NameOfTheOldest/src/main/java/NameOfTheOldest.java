
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();

        int oldest = 0;
        String oldestName = "";

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            names.add(input);
            String[] arr = input.split(",");
            liste.add(arr[1]);
        }

        for(String s : liste){
            if(Integer.valueOf(s) > oldest){
                oldest = Integer.valueOf(s);
            }
        }

        for(String s : names){
            if(s.contains(String.valueOf(oldest))){
                oldestName = s.split(",")[0];
            }
        }

        System.out.println("Age of the oldest: " + oldestName);

    }
}
