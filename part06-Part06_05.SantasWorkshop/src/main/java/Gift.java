public class Gift {
    private int weight;
    private String name;
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Gift [weight=" + weight + ", name=" + name + "]";
    }
}
