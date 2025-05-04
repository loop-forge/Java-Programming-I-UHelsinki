import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        if(this.scanner != null){
            while (true) {
                System.out.print("Command: ");
                String input = this.scanner.nextLine();

                switch(input){
                    case "end" : System.out.println("Bye bye!");
                    break;
                    case "add" : addWord();
                    break;
                    case "search" : searchWord();
                    break;
                    default : System.out.println("Unknown command");
                    break;
                }

                if(input.equals("end")){
                    break;
                }
            }
        }
    }

    public void addWord(){
        System.out.print("Word: ");
        String foreignWord = this.scanner.nextLine();

        System.out.print("Translation: ");
        String translatedWord = this.scanner.nextLine();
        
        this.dictionary.add(foreignWord, translatedWord);
    }

    public void searchWord(){
        System.out.print("To be translated: ");
        String foreignWord = this.scanner.nextLine();
        
        if (this.dictionary.translate(foreignWord) == null) {
            System.out.println("Word " + foreignWord + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(foreignWord));
        }
    }
}
