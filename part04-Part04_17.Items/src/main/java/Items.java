
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.equals("")){ break ; }
            else { items.add(new Item(name)) ; }
        }

        if(items.size()>0){
            for(Item item : items){
                System.out.println(item);
            }
        }
    }
}
