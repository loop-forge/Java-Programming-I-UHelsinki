import java.util.ArrayList;

public class Room {
    private ArrayList<Person> pList;
    public Room(){
        this.pList = new ArrayList<>();
    }

    public void add(Person person){
        this.pList.add(person);
    }

    public boolean isEmpty(){
        if(this.pList.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return this.pList;
    }

    public Person shortest(){
        if(!this.pList.isEmpty()){
            Person shortest = this.pList.get(0);
            for(Person p : this.pList){
                if(shortest.getHeight()>p.getHeight()){
                    shortest = p;
                }
            }
            return shortest;
        }
        return null;
    }


    public Person take(){
        if(this.shortest() != null && !this.pList.isEmpty()){
            Person shortest = this.shortest();
            for(Person p : this.pList){
                if(p.equals(shortest)){
                    pList.remove(p);
                    return shortest;
                }
            }
        }
        return null;
    }
}
