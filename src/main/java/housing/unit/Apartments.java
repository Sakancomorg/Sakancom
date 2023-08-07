package housing.unit;

import java.util.ArrayList;
import java.util.List;

public class Apartments {
    private int numberOfBathrooms;
    private int numberOfBedrooms;
    private boolean hasBalcony;
    private int floor;
    private int id;
    private List<String> tenantNames = new ArrayList<>();
    private List<String> meansOfCommunication = new ArrayList<>();

    public Apartments(int floor, int id, List<String> tenantNames, List<String> meansOfCommunication,
                      int numberOfBathrooms, int numberOfBedrooms, boolean hasBalcony) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.hasBalcony = hasBalcony;
        this.tenantNames = tenantNames;
        this.meansOfCommunication = meansOfCommunication;
        this.id = id;
        this.floor = floor;
    }

    public Apartments() {
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getTenantNames() {
        return tenantNames;
    }

    public void setTenantNames(List<String> tenantNames) {
        this.tenantNames = tenantNames;
    }

    public List<String> getMeansOfCommunication() {
        return meansOfCommunication;
    }

    public void setMeansOfCommunication(List<String> meansOfCommunication) {
        this.meansOfCommunication = meansOfCommunication;
    }

    @Override
    public String toString() {
        return "\nID: " + id +
                ", Tenant Names: " + tenantNames +
                ", Means of Communication: " + meansOfCommunication +
                ", Bathrooms: " + numberOfBathrooms +
                ", Bedrooms: " + numberOfBedrooms +
                ", Balcony: " + hasBalcony;
    }
}
