package housing.unit;

import java.util.Objects;

public class HousingUnit {
	
	private LocationInfo locationInfo;
    private Apartments apartmentInfo;
    private boolean reservedFlag;
    private boolean studentHouse;
    private int numoffloors;
    private String availableServices;
    private int numoftenants;



    public String getAvailableServices() {
		return availableServices;
	}

	public void setAvailableServices(String availableServices) {
		this.availableServices = availableServices;
	}

	public int getNumoftenants() {
		return numoftenants;
	}

	public void setNumoftenants(int numoftenants) {
		this.numoftenants = numoftenants;
	}

	public HousingUnit(LocationInfo locationInfo, Apartments apartmentInfo,
                       boolean reservedFlag, boolean studentHouse,int numoffloors,String availableServices) {
        this.locationInfo = locationInfo;
        this.apartmentInfo = apartmentInfo;
        this.reservedFlag = reservedFlag;
        this.studentHouse = studentHouse;
        this.numoffloors=numoffloors;
        this.availableServices=availableServices;
    }

    public int getNumoffloors() {
		return numoffloors;
	}

	public void setNumoffloors(int numoffloors) {
		this.numoffloors = numoffloors;
	}

	public LocationInfo getLocationInfo() {
		return locationInfo;
	}

	public void setLocationInfo(LocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public Apartments getApartmentInfo() {
		return apartmentInfo;
	}

	public void setApartmentInfo(Apartments apartmentInfo) {
		this.apartmentInfo = apartmentInfo;
	}

	public boolean isReservedFlag() {
		return reservedFlag;
	}

	public void setReservedFlag(boolean reservedFlag) {
		this.reservedFlag = reservedFlag;
	}


	public boolean isStudentHouse() {
		return studentHouse;
	}

	public void setStudentHouse(boolean studentHouse) {
		this.studentHouse = studentHouse;
	}

	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        HousingUnit that = (HousingUnit) o;
	        return locationInfo.getId() == that.locationInfo.getId();
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(locationInfo.getId());
	    }

	    @Override
	    public String toString() {
	        return "ID: " + locationInfo.getId() +
	                ", Location: " + locationInfo.getLocation() +
	                ", Rent: $" + locationInfo.getRent() +
	                ", Tenants: " +getNumoftenants()  +
	                ", Floors: " + getNumoffloors() +
	                ", Services: " + getAvailableServices() +
	                ", Accept: " + reservedFlag +
	                ", \nApartments: " + apartmentInfo.toString();
	    }
  
}
    
