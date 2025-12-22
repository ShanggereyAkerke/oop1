public class Property {
    private String address;
    private int squareFootage;
    private double price;
    private boolean isAvailable;

    public Property(){
    }
    public Property(String address, int squareFootage, double price){
        this.address=address;
        this.squareFootage=squareFootage;
        this.price=price;
        this.isAvailable=true;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getSquareFootage(){
        return squareFootage;
    }
    public void setSquareFootage(int squareFootage){
        this.squareFootage=squareFootage;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable=available;
    }
    public void markSold() {
        this.isAvailable = false;
        System.out.println(address + " has been sold!");
    }
}