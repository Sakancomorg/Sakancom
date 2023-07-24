package housing.unit;

public class HousingUnit {
	

    private String location;
    private String photo;
    private double rent;
    private int numberOfTenants;
    private int numberOfFloors;
    private String availableServices;

    public HousingUnit(String location, String photo, double rent, int numberOfTenants, int numberOfFloors, String availableServices) {
        this.location = location;
        this.photo = photo;
        this.rent = rent;
        this.numberOfTenants = numberOfTenants;
        this.numberOfFloors = numberOfFloors;
        this.availableServices = availableServices;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HousingUnit other = (HousingUnit) obj;
        return Double.compare(other.rent, rent) == 0 &&
               numberOfTenants == other.numberOfTenants &&
               numberOfFloors == other.numberOfFloors &&
               location.equals(other.location) &&
               photo.equals(other.photo) &&
               availableServices.equals(other.availableServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, photo, rent, numberOfTenants, numberOfFloors, availableServices);
    }

}
