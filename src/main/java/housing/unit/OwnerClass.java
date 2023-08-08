package housing.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class OwnerClass {
    private static final Logger logger = Logger.getLogger(OwnerClass.class.getName());

	List<HousingUnit> houseinfo = new ArrayList<HousingUnit>();
	List<String> tenantNames = new ArrayList<String>();
	List<String> meansOfCommunication = new ArrayList<String>();
	Apartments apr;
	private Scanner scanner;
	private boolean readinfoflag=false;
	private boolean addflag=false;
	private boolean viewflag=false;
	private boolean numfloorandTen=false;
	int idresidence=0;
	int idapart=0;
	int floornum=0;
	
	public boolean isAddflag() {
		return addflag;
	}
	
	public boolean isViewflag() {
		return viewflag;
	}
	
	public boolean isNumfloorandTen() {
		return numfloorandTen;
	}
	
	public boolean isViewapartflag() {
		return viewapartflag;
	}
	
	public boolean isC() {
		return c;
	}
	
	private boolean viewapartflag=false;
	private boolean c=false;

    public OwnerClass(Scanner scanner) {
        this.scanner = scanner;
    }
     private int choice;
    

public  void ownermenu() {

    do {
    	logger.info("========= Housing Owner Menu =========");
        logger.info("1. Add a private residence");
        logger.info("2. View listed residences");
        logger.info("3. Display the number of tenants and floors in specific residence");
        logger.info("4. Display tenant information and apartment details");
        logger.info("5. Exit");
        logger.info("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:{
            	c=true;
            	addresidence();
                break;
            }
            	
            case 2:
            	viewresidences();
                break;
            case 3:
            	numoftenant() ;
                     numoffloors() ;            
                       break;

            case 4:  	
            	viewapatmen() ;
                      break;

            case 5:

                logger.info("Exiting the Housing Owner App. Goodbye!");
                break;
            default:
                logger.info("Invalid choice. Please try again.");
        }
    } while (choice != 5);

}
public int getChoice() {
	return choice;
}
public void addresidence() {
	    readinfoflag = true;
        logger.info("Enter the id:");
        int idd = scanner.nextInt();
        scanner.nextLine();

        logger.info("Enter the location:");
        String locationr = scanner.nextLine();

        logger.info("Enter the photo:");
        String photos = scanner.nextLine();

        logger.info("Enter the rent:");
        double rents = scanner.nextDouble();
        scanner.nextLine();


        logger.info("Enter the number of floors:");
        int numberofFloors = scanner.nextInt();
        scanner.nextLine();

        logger.info("Enter available services:");
        String availableServices = scanner.nextLine();

        logger.info("Is the residence for Students? (true/false):");
        boolean studentflag = scanner.nextBoolean();
        scanner.nextLine();
        logger.info("Enter the number of floor:");
        floornum = scanner.nextInt();
        scanner.nextLine();
        logger.info("Enter the id of apartment:");
        int ida = scanner.nextInt();
        scanner.nextLine();
        logger.info("Enter tenant Names:");
      
        logger.info("Enter the means Of Communication: ");
        String comm=  scanner.nextLine();
        meansOfCommunication.add(comm);

         apr=new Apartments(floornum,ida ,tenantNames,meansOfCommunication,numberofFloors,3,true);
         
         LocationInfo locationInfo = new LocationInfo(locationr, photos, rents, idd);
         HousingUnit house = new HousingUnit(locationInfo, apr, true, studentflag, floornum,availableServices);

        houseinfo.add(house);
	    MyData.addAdvertisementList(house);
	    addflag = true;
	}

public void init() {
	int iD1 = 1;
    String location1 = "Sample Location 1";
    String photo1 = "sample1.jpg";
    double rent1 = 1200.0;
    int numberOfTenants1 = 4;
    int numberOfFloors1 = 2;
    String availableServices1 = "Parking, Gym";
    boolean acceptflag1 = true;

    int floornum1 = 2;
    int ida1 = 101;
    ArrayList<String> tenantNames1 = new ArrayList<String>();
    tenantNames1.add("John Doe");
    ArrayList<String> meansOfCommunication1 = new ArrayList<String>();
    meansOfCommunication1.add("Email");

    Apartments a1 = new Apartments(floornum1, ida1, tenantNames1, meansOfCommunication1, numberOfTenants1, numberOfFloors1, acceptflag1);
    LocationInfo locationInfo1 = new LocationInfo(location1, photo1, rent1, iD1);
    HousingUnit house1 = new HousingUnit(locationInfo1, a1, true, true, floornum,availableServices1);

    
    houseinfo.add(house1);
    int iD2 = 2;
    String location2 = "123 Main Street";
    String photo2 = "house.jpg";
    double rent2 = 1800.0;
    int numberOfTenants2 = 3;
    int numberOfFloors2 = 1;
    String availableServices2 = "Swimming pool, Security";
    boolean acceptflag2 = false;

    int floornum2 = 1;
    int ida2 = 102;
    ArrayList<String> tenantNames2 = new ArrayList<String>();
    tenantNames2.add("Jane Smith");
    ArrayList<String> meansOfCommunication2 = new ArrayList<String>();
    meansOfCommunication2.add("Phone");

    Apartments a2 = new Apartments(floornum2, ida2, tenantNames2, meansOfCommunication2, numberOfTenants2, numberOfFloors2, acceptflag2);
    
    LocationInfo locationInfo2 = new LocationInfo(location2, photo2, rent2, iD2);
    HousingUnit house2 = new HousingUnit(locationInfo2, a2, true, true, floornum,availableServices2);

    
    houseinfo.add(house2);


}
public void viewresidences() {
	init();
	for (HousingUnit unit : houseinfo) {
	    String unitInfo = String.format(
	        "ID: %d, Location: %s, Rent: $%.2f, Tenants: %d, Floors: %d, Services: %s, Accept: %b",
	        unit.getLocationInfo().getId(), unit.getLocationInfo().getLocation(), unit.getLocationInfo().getRent(), unit.getNumoftenants(),
	        unit.getNumoffloors(), unit.getAvailableServices(), unit.isReservedFlag()
	    );
	    logger.info(unitInfo);
	    String apartmentsInfo = String.format("Apartments: %s", unit.getApartmentInfo().toString());
	    logger.info(apartmentsInfo);

	    
	}

	viewflag=true;
	
}
public void numoftenant() {
	int num=0;
	logger.info("Enter the id of the residence: ");
     idresidence = scanner.nextInt();
    for(int i=1;i<=houseinfo.size();i++) {
    	if(idresidence==i) {
            num=houseinfo.get(i).getNumoftenants();
    	}
    }
    numfloorandTen =true;
    String tenantCountInfo = String.format("The number of tenant is: %d", num);
    logger.info(tenantCountInfo);
}
public void numoffloors() {
	int n=0;
	for(int i=1;i<houseinfo.size();i++) {
    	if(idresidence==i) {
            n=houseinfo.get(i).getNumoffloors();
    	}
    numfloorandTen =true;
    String floorsInfo = String.format("And the number of floors is: %d", n);
    logger.info(floorsInfo);
    
}
}
public void viewapatmen() {
	ArrayList<Apartments> apartmentsList = new ArrayList<Apartments>();
    viewapartflag = true;

    logger.info("Enter the number of floor:");
	int idf = scanner.nextInt();
    for (HousingUnit unit : houseinfo) {
        if (unit.getApartmentInfo().getFloor() == idf) {
        	Apartments apartment = unit.getApartmentInfo();
            apartmentsList.add(apartment);
            
        }
    }

    if (!apartmentsList.isEmpty()) {

        for (Apartments apartment : apartmentsList) {
        	 logger.info("Floor Number: " + apartment.getFloor());
             logger.info("Number of Bathrooms: " + apartment.getNumberOfBathrooms());
             logger.info("Number of Bedrooms: " + apartment.getNumberOfBedrooms());
             logger.info("Balcony Availability: " + apartment.isHasBalcony());

             logger.info("Tenants in the Apartment:");
             tenantNames = apartment.getTenantNames();
             meansOfCommunication = apartment.getMeansOfCommunication();

             for (int i = 0; i < tenantNames.size(); i++) {
            	    String tenantInfo = String.format("Tenant Name: %s, Means of Communication: %s",
            	                                      tenantNames.get(i), meansOfCommunication.get(i));
            	    logger.info(tenantInfo);
            	}


            logger.info("") ;       }
    } else {
    	
    	String noApartmentsInfo = String.format("No apartments found on floor number %d", idf);
    	logger.info(noApartmentsInfo);
    }

	}   

    
}
