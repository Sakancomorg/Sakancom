package housing.unit;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Sakancom.Apartments;
import Sakancom.User;

public class HousingUnit {
	
	


    private String location;
    private String photo;
    private double rent;
    private int numberOfTenants;
    private int numberOfFloors;
    int id;
    private String availableServices;
    private boolean acceptflag;
    private Apartments A;
    
    
    public HousingUnit(int id, String location, String photo, double rent, int numberOfTenants, int numberOfFloors,
             String availableServices, boolean acceptflag, Apartments A) {
    this.location = location;
    this.photo = photo;
    this.rent = rent;
    this.numberOfTenants = numberOfTenants;
    this.numberOfFloors = numberOfFloors;
    this.availableServices = availableServices;
    this.acceptflag = acceptflag;
    this.id = id;
    this.A = A;
}

    public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getPhoto() {
		return photo;
	}




	public void setPhoto(String photo) {
		this.photo = photo;
	}




	public double getRent() {
		return rent;
	}




	public void setRent(double rent) {
		this.rent = rent;
	}




	public int getNumberOfTenants() {
		return numberOfTenants;
	}




	public void setNumberOfTenants(int numberOfTenants) {
		this.numberOfTenants = numberOfTenants;
	}




	public int getNumberOfFloors() {
		return numberOfFloors;
	}




	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getAvailableServices() {
		return availableServices;
	}




	public void setAvailableServices(String availableServices) {
		this.availableServices = availableServices;
	}




	public boolean isAcceptflag() {
		return acceptflag;
	}




	public void setAcceptflag(boolean acceptflag) {
		this.acceptflag = acceptflag;
	}




	public Apartments getA() {
		return A;
	}




	public void setA(Apartments a) {
		A = a;
	}




	   @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        HousingUnit that = (HousingUnit) o;
	        return id == that.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Location: " + location +
                ", Rent: $" + rent +
                ", Tenants: " + numberOfTenants +
                ", Floors: " + numberOfFloors +
                ", Services: " + availableServices +
                ", Accept: " + acceptflag +
                ", \nApartments: " + A;
    }
    
 
	public static HousingUnit findHousingUnitById() {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the ID of the housing unit to modify: ");
	        int id = scanner.nextInt();

	 for (HousingUnit house :  MyApp.getHousingUnitList()) {
	        if (house.getId() == id) {
	            return house;
	        }
	    }
	    return null;
	}
}
    
    
    
    
    
    
    
    
    


