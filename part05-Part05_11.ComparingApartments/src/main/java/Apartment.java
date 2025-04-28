
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;


    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSquares() {
        return squares;
    }

    public void setSquares(int squares) {
        this.squares = squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(int princePerSquare) {
        this.pricePerSquare = princePerSquare;
    }

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares >= compared.getSquares()){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int price1 = this.pricePerSquare*this.squares;
        int price2 = compared.getPricePerSquare() * compared.getSquares();
        int priceDiff = Math.abs(price1-price2);
        return priceDiff;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if(this.pricePerSquare*this.squares >= compared.getPricePerSquare() * compared.getSquares()){
            return true;
        } else {
            return false;
        }

    }

}
