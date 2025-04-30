import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> liste;

    public Package(){
        this.liste = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.liste.add(gift);
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Gift gift : this.liste){
            totalWeight+=gift.getWeight();
        }
        return totalWeight;
    }
}
