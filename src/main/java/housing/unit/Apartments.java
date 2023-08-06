package housing.unit;



import java.util.ArrayList;

public class Apartments {
	private int numberOfBathrooms;
    private int numberOfBedrooms;
    private boolean hasBalcony;
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

	public ArrayList<String> getTenantNames() {
		return tenantNames;
	}

	public void setTenantNames(ArrayList<String> tenantNames) {
		this.tenantNames = tenantNames;
	}

	public ArrayList<String> getMeansOfCommunication() {
		return meansOfCommunication;
	}

	public void setMeansOfCommunication(ArrayList<String> meansOfCommunication) {
		this.meansOfCommunication = meansOfCommunication;
	}
	private int floor;

    
    int id;
	ArrayList<String> tenantNames = new ArrayList<String>();
	ArrayList<String> meansOfCommunication = new ArrayList<String>();


/*public void a() {
	tenantNames.add("John Doe");
	tenantNames.add("Jane Smith");
	meansOfCommunication.add("Email: john.doe@example.com");
	meansOfCommunication.add("Phone: +1 123-456-7890");
}*/

    public Apartments(int floor,int id,ArrayList tenantNames,ArrayList meansOfCommunication,int numberOfBathrooms, int numberOfBedrooms, boolean hasBalcony) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.hasBalcony = hasBalcony;
        this.tenantNames=tenantNames;
        this.meansOfCommunication=meansOfCommunication;
        this.id=id;    
        this.floor=floor;
    }
    
    public Apartments() {
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
