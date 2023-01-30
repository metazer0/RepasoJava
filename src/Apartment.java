public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){

        if(this.squares > compared.squares){
            return true;
        }

        return false;
    }
    public int priceDifference(Apartment compared){
        int priceApartment= this.pricePerSquare * this.squares;
        int priceCompared = compared.pricePerSquare * compared.squares;
        int priceDiff =  priceApartment - priceCompared;
        if(priceDiff < 0){
            return priceDiff * -1;
        }
        return priceDiff;
    }
}
