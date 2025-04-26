public class Cube {
    private int edgeLength;
    private int volume;

    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }

    public int volume(){
        this.volume = this.edgeLength*this.edgeLength*this.edgeLength;
        return volume;
    }

    @Override 
    public String toString(){
        return "The length of the edge is " + edgeLength + " and the volume " + volume(); 
    }
}
