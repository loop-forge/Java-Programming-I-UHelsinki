import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> holder;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.holder = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight + suitcase.totalWeight() <= this.maxWeight){
            holder.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        } else {
            return;
        }
    }

    public void printItems(){
        if(!this.holder.isEmpty()){
            for(Suitcase suitcase : this.holder){
                    suitcase.printItems();
            }
        }
    }

    public String toString(){
        String formatting = "";
        switch(this.holder.size()){
            case 0 : formatting += "no suitcase" + " (" + this.totalWeight + " kg)";
            break;
            case 1 : formatting += this.holder.size() + " suitcase" + " (" + this.totalWeight + " kg)";
            break;
            default : formatting += this.holder.size() + " suitcases" + " (" + this.totalWeight + " kg)";
            break;
        }
        return formatting;
    }
}
