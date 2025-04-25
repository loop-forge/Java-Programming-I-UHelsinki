import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> list = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.equals("")){ 
                break ; 
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            list.add(new Book(title, pages, year)); 
        }

        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();

        for(Book book : list){
            switch (information) {
                case "everything" : System.out.println(book);
                break;
                case "name" : System.out.println("Title: " + book.getTitle());
                break;
                case "pages" : System.out.println("Pages: " + book.getPages());
                break;
                case "year" : System.out.println("Year: " + book.getYear());
                break;
            }
        }
    }
}
