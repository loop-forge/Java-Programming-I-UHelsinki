import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Item> items; 

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if(this.totalWeight + item.getWeight() <= this.maxWeight){
            items.add(item);
            this.totalWeight += item.getWeight();
        } else {
            return;
        }
    }

    public int totalWeight(){
        return this.totalWeight;
    }

    
    public void printItems(){
        if(!this.items.isEmpty()){
            for(Item item : this.items){
                System.out.println(item);
            }
        }
    }

    public Item heaviestItem(){
        if(!this.items.isEmpty()){
            Item heaviest = this.items.get(0);
            for(Item item : this.items){
                if(heaviest.getWeight()<item.getWeight()){
                    heaviest = item;
                }
            }
            return heaviest;
        }
        return null;
    }

    public String toString(){
        String formatting = "";
        switch(this.items.size()){
            case 0 : formatting += "no items" + " (" + this.totalWeight + " kg)";
            break;
            case 1 : formatting += this.items.size() + " item" + " (" + this.totalWeight + " kg)";
            break;
            default : formatting += this.items.size() + " items" + " (" + this.totalWeight + " kg)";
            break;
        }
        return formatting;
    }
    
}
