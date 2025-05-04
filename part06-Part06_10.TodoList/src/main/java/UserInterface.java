import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todo;

    public UserInterface(TodoList todo, Scanner scanner){
        this.scanner = scanner;
        this.todo = todo;
    }

    public void start(){
        if(this.scanner != null){
            while (true) {
                System.out.print("Command: ");
                String input = this.scanner.nextLine();

                switch(input){
                    case "stop" : break;
                    case "add" : this.todo.add(this.scanner.nextLine());
                    break;
                    case "list" : this.todo.print();
                    break;
                    case "remove" : remove();
                    break;
                    default : System.out.println("Unknown command");
                    break;
                }

                if(input.equals("stop")){
                    break;
                }
            }
        }
    }

    public void remove(){
        System.out.println("Which one is removed?");
        this.todo.remove(Integer.valueOf(scanner.nextLine()));
    }
}
