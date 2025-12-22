public class Realtor{
    private int id;
    private String name;
    private String phoneNumber;
    private int yearsOfExperience;
    private double commissionRate;
    public Realtor(){}
    public Realtor(int id, String name, String phoneNumber, int yearsOfExperience, double commissionRate){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.commissionRate = commissionRate;
    }
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}

    public String getPhoneNumber() {
        return phoneNumber;}
    public void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;}

    public int getYearsOfExperience() {
        return yearsOfExperience;}
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;}

    public double getCommissionRate() {
        return commissionRate;}
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;}
    public double calculateCost(double price){
        return price * (commissionRate /100);
    }
}
