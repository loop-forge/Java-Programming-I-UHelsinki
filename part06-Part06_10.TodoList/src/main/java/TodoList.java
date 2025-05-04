import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        // Constructor to initialize the TodoList
        this.tasks = new ArrayList<String>();
    }
    public void add(String task) {
        // Code to add a task to the list
        this.tasks.add(task);
    }
    public void remove(int number) {
        // Code to remove a task from the list
        this.tasks.remove(number-1);
    }
    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ": " + tasks.get(i));
        }
    }
}
