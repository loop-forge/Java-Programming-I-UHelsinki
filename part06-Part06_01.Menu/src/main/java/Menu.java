
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
            meals.add(meal);
        } else {
            System.out.println("Meal already on the list");
        }
    }

    public void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
