public class Main {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency("Astana Agency", "Astana", 10, 5);
        Property property1 = new Property("Qabanbay batyr 23", 120, 2000);
        Property property2 = new Property("Turan 55", 80, 120000);
        Property property3 = new Property("Syganaq 16/1", 150, 350000);
        Realtor realtor1 = new Realtor(1, "Shangerey Akerke", "7 777 123 4567", 5, 4.0);
        Realtor realtor2 = new Realtor(2, "Kairat Nurtas", "7 705 105 1234", 10, 4.8);
        agency.addProperty(property1);
        agency.addProperty(property2);
        agency.addProperty(property3);
        agency.addRealtor(realtor1);
        agency.addRealtor(realtor2);

        System.out.println("=== Real Estate Agency ===");
        agency.printInfo();

        Property[] properties = {property1, property2, property3};
        Property largest = properties[0], smallest = properties[0];
        double total = 0;

        for (int i = 0; i < properties.length; i++) {
            total += properties[i].getPrice();
            if (properties[i].getSquareFootage() > largest.getSquareFootage())
                largest = properties[i];
            if (properties[i].getSquareFootage() < smallest.getSquareFootage())
                smallest = properties[i];
        }
        System.out.println("\nLargest: " + largest.getAddress() + " (" + largest.getSquareFootage() + "m²)");
        System.out.println("Smallest: " + smallest.getAddress() + " (" + smallest.getSquareFootage() + "m²)");
        System.out.println("Total Value of the Properties: " + total + " $");

        Property mostExpensive = agency.findMostExpensiveProperty();
        System.out.println("\n=== Most Expensive Property ===");
        if (mostExpensive != null) {
            System.out.println("Address: " + mostExpensive.getAddress());
            System.out.println("Price: $" + mostExpensive.getPrice());

            Realtor mostExpRealtor = agency.findMostExperiencedRealtor();
            System.out.println("\nMost Experienced Realtor: " + mostExpRealtor.getName());

            double commission = mostExpRealtor.calculateCost(mostExpensive.getPrice());
            System.out.println("Commission for the most expensive property" + mostExpensive.getAddress() + ": $" + commission);
        }
        System.out.println("\n=== Selling Property ===");
        Property cheapest = properties[0];
        for (int i = 1; i < properties.length; i++) {
            if (properties[i].getPrice() < cheapest.getPrice()) {
                cheapest = properties[i];
            }
        }
        System.out.println("Property to sell (cheapest): " + cheapest.getAddress());
        System.out.println("Is it available: " + cheapest.isAvailable());
        cheapest.markSold();
        System.out.println("After: is it available? " + cheapest.isAvailable());
    }
}