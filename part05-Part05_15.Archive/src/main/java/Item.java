public class Item {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return this.id.equals(comparedItem.id);
    }
}
