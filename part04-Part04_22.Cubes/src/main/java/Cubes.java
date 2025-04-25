
import java.util.ArrayList;
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String string = scanner.nextLine();
            
            if(string.equals("end")){ 
                break ; 
            }
            try {
                Integer conversion = Integer.valueOf(string);
                Integer conversionCube = conversion * conversion * conversion;
                System.out.println(String.valueOf(conversionCube));
                list.add(conversionCube);
            } catch (NumberFormatException e) {
                System.out.println("erreur>" + e);
            }
        }

        // for(int number : list){
        //     System.out.println(number);
        // }
    }
}
