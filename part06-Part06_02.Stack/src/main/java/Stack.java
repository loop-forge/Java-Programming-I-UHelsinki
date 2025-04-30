import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        list.add(0, value);
    }

    public ArrayList<String> values(){
        ArrayList<String> outputs = new ArrayList<>();
        if(!this.list.isEmpty()){
            for(String input : this.list){
                outputs.add(input);
            }
        }
        return outputs;
    }

    public String take(){
        
        int firstIndex = 0;
        String lastValue = this.list.get(0);

        this.list.remove(firstIndex);
        return lastValue;
    }
}
