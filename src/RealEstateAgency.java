public class RealEstateAgency {
    private String name;
    private String location;
    private Property[] properties;
    private Realtor[] realtors;
    private int propertyCount;
    private int realtorCount;
    public RealEstateAgency(String name, String location, int maxProperties, int maxRealtors ) {
        this.name = name;
        this.location = location;
        this.properties = new Property[maxProperties];
        this.realtors = new Realtor[maxRealtors];
        this.propertyCount = 0;
        this.realtorCount = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;
    }
    public String getLocation() {return location;
    }
    public void setLocation(String location) {this.location = location;
    }
    public Property[] getProperties() {return properties;
    }
    public void setProperties(Property[] properties) {this.properties = properties;
    }

    public Realtor[] getRealtors() {return realtors;
    }
    public void setRealtors(Realtor[] realtors) {this.realtors = realtors;
    }
    public int getPropertyNumber() {return propertyCount;
    }
    public int getRealtorsNumber() {return realtorCount;
    }
    public void addProperty(Property property) {
       if (propertyCount<properties.length){
           properties[propertyCount] = property;
           propertyCount++;
       }else{
           System.out.println("Cannot add more properties");
       }
    }
    public void addRealtor(Realtor realtor) {
        if (realtorCount<realtors.length){
            realtors[realtorCount] = realtor;
            realtorCount++;
        }
        else {
            System.out.println("Cannot add more realtors");
        }
    }
    public  Property findMostExpensiveProperty(){
        if(propertyCount==0)
            return null;
        Property mostExpensiveProperty = properties[0];
        for(int i=1;i<propertyCount;i++){
            if(properties[i].getPrice()>mostExpensiveProperty.getPrice()){
                mostExpensiveProperty = properties[i];
            }
        }
        return mostExpensiveProperty;
    }
    public  Realtor findMostExperiencedRealtor(){
        if(realtorCount==0)
            return null;
        Realtor mostExperiencedRealtor = realtors[0];
        for(int i=1;i<realtorCount;i++){
            if(realtors[i].getYearsOfExperience()>mostExperiencedRealtor.getYearsOfExperience()){
                mostExperiencedRealtor = realtors[i];
            }
        }
        return mostExperiencedRealtor;
    }
    public void printInfo(){
        System.out.println("Name of the Agency: " + name);
        System.out.println("Location: " + location);
        System.out.println("Realtors: " + realtorCount);
    }
}