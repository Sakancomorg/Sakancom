package Sakancom;

import java.util.ArrayList;

public class Apartments {
	private int numberOfBathrooms;
    private int numberOfBedrooms;
    private boolean hasBalcony;
    private int floor;

    
    int id;
	ArrayList<String> tenantNames = new ArrayList<String>();
	ArrayList<String> meansOfCommunication = new ArrayList<String>();


public void a() {
	tenantNames.add("John Doe");
	tenantNames.add("Jane Smith");
	meansOfCommunication.add("Email: john.doe@example.com");
	meansOfCommunication.add("Phone: +1 123-456-7890");
}

    public Apartments(int floor,int id,ArrayList tenantNames,ArrayList meansOfCommunication,int numberOfBathrooms, int numberOfBedrooms, boolean hasBalcony) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.hasBalcony = hasBalcony;
        this.tenantNames=tenantNames;
        this.meansOfCommunication=meansOfCommunication;
        this.id=id;    
        this.floor=floor;
   
    @Override
    public String toString() {
        return "\nID: " + id +
                ", Tenant Names: " + tenantNames +
                ", Means of Communication: " + meansOfCommunication +
                ", Bathrooms: " + numberOfBathrooms +
                ", Bedrooms: " + numberOfBedrooms +
                ", Balcony: " + hasBalcony;
    }
    public void printA () {
        System.out.println("\nID: " + id +
                ", Tenant Names: " + tenantNames +
                ", Means of Communication: " + meansOfCommunication +
                ", Bathrooms: " + numberOfBathrooms +
                ", Bedrooms: " + numberOfBedrooms +
                ", Balcony: " + hasBalcony);
    }

}
