
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(this.elements.isEmpty()){
            return "The collection " + name + " is empty.";
        } 

        if (this.elements.size()==1) {
            String printOutputS = "The collection " + name + " has " + this.elements.size() + " element:\n" + this.elements.get(0); 
            return printOutputS;
        }
        
        else {
            String printOutput = "The collection " + name + " has " + this.elements.size() + " elements:\n";
            String allElements = "";
            for(String element : elements){
                allElements += element + "\n";
            }
            return printOutput + allElements;
        }
    }
}
