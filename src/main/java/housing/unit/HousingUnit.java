package housing.unit;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HousingUnit {
	
    private String location;
    private String photo;
    private double rent;
    private int numberOfTenants;
    private int numberOfFloors;
    int id;
    private String availableServices;
    private boolean reservedFlag;
    private Apartments A;
    private TenantClass t;
    private boolean studentHouse;
    public HousingUnit(int id, String location, String photo, double rent, int numberOfTenants, int numberOfFloors,
             String availableServices, boolean reservedFlag, Apartments A,boolean studentHouse) {
    this.location = location;
    this.photo = photo;
    this.rent = rent;
    this.numberOfTenants = numberOfTenants;
    this.numberOfFloors = numberOfFloors;
    this.availableServices = availableServices;
    this.reservedFlag = reservedFlag;
    this.id = id;
    this.A = A;
    this.studentHouse=studentHouse;
}

    
    public boolean isReservedFlag() {
		return reservedFlag;
	}

	public void setReservedFlag(boolean reservedFlag) {
		this.reservedFlag = reservedFlag;
	}

	public TenantClass getT() {
		return t;
	}

	public void setT(TenantClass t) {
		this.t = t;
	}

	public boolean isStudentHouse() {
		return studentHouse;
	}

	public void setStudentHouse(boolean studentHouse) {
		this.studentHouse = studentHouse;
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




	public boolean isReserved() {
		return reservedFlag;
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
<<<<<<< HEAD
                ", Location: " + location +
                ", Rent: $" + rent +
                ", Tenants: " + numberOfTenants +
                ", Floors: " + numberOfFloors +
                ", Services: " + availableServices +
                ", Accept: " + reservedFlag +
                ", \nApartments: " + A.toString();
      
        	
=======
                ",\n Location: " + location +
                ",\n Rent: $" + rent +
                ",\n Tenants: " + numberOfTenants +
                ",\n Floors: " + numberOfFloors +
                ",\n Services: " + availableServices +
                ",\n Accept: " + acceptflag +
                ",\nApartments: " + A;
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe
    }
  
 
    
    static HousingUnit FindHouse(ArrayList <HousingUnit> list) {
    	 Scanner scanner = new Scanner(System.in);
		  int  id=Integer.parseInt(scanner.next()); // Consume the newline character
		  HousingUnit houseR = null;
		  for(HousingUnit house:list) {
				if(house.getId()==id) {
					
					houseR=house;
				}
			}
			return houseR;
			
	}


	
	

}
    
    
    
    
    
    
    
    
    


