
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] split = input.split(" ");
            for(String s : split){
                if(s.contains("av")){
                    System.out.println(s);
                }
            }
        }

    }
}
