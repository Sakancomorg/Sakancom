package housing.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HousingUnit {
	
	private String location;
    private String photo;
    private double rent;
    private int numberOfTenants;
    private int numberOfFloors;
    private int id;
    private String availableServices;
    private boolean reservedFlag;
    private Apartments a;
    private TenantClass t;
    private boolean studentHouse;

    private HousingUnit(String location, String photo, double rent, int numberOfTenants, int numberOfFloors,
                        String availableServices, boolean reservedFlag, Apartments a, boolean studentHouse, int id) {
        this.location = location;
        this.photo = photo;
        this.rent = rent;
        this.numberOfTenants = numberOfTenants;
        this.numberOfFloors = numberOfFloors;
        this.availableServices = availableServices;
        this.reservedFlag = reservedFlag;
        this.a = a;
        this.studentHouse = studentHouse;
        this.id = id;
    }

    public static class Builder {
        private String location;
        private String photo;
        private double rent;
        private int numberOfTenants;
        private int numberOfFloors;
        private int id;
        private String availableServices;
        private boolean reservedFlag;
        private Apartments a;
        private TenantClass t;
        private boolean studentHouse;

        public Builder(String location, int id) {
            this.location = location;
            this.id = id;
        }

        public Builder setPhoto(String photo) {
            this.photo = photo;
            return this;
        }

        public Builder setRent(double rent) {
            this.rent = rent;
            return this;
        }

        public Builder setNumberOfTenants(int numberOfTenants) {
            this.numberOfTenants = numberOfTenants;
            return this;
        }

        public Builder setNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public Builder setAvailableServices(String availableServices) {
            this.availableServices = availableServices;
            return this;
        }

        public Builder setReservedFlag(boolean reservedFlag) {
            this.reservedFlag = reservedFlag;
            return this;
        }

        public Builder setApartments(Apartments a) {
            this.a = a;
            return this;
        }

        public Builder setStudentHouse(boolean studentHouse) {
            this.studentHouse = studentHouse;
            return this;
        }

        public HousingUnit build() {
            return new HousingUnit(location, photo, rent, numberOfTenants, numberOfFloors,
                    availableServices, reservedFlag, a, studentHouse, id);
        }
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
		return a;
	}

	public void setA(Apartments a) {
		this.a = a;
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
                ", Accept: " + reservedFlag +
                ", \nApartments: " + a.toString();
      
        	

    }
  
    
    static HousingUnit FindHouse(List <HousingUnit> list) {
    	 Scanner scanner = new Scanner(System.in);
		  int  id=Integer.parseInt(scanner.next()); 
		  HousingUnit houseR = null;
		  for(HousingUnit house:list) {
				if(house.getId()==id) {
					
					houseR=house;
				}
			}
			return houseR;
			
	}


	
	

}
    
    
    
    
    
    
    
    
    


