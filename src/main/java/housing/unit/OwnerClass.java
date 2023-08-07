package housing.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class OwnerClass {
    private static final Logger logger = Logger.getLogger(OwnerClass.class.getName());

	List<HousingUnit> houseinfo = new ArrayList<HousingUnit>();
	List<String> tenantNames = new ArrayList<String>();
	List<String> meansOfCommunication = new ArrayList<String>();
	Apartments A;
	private Scanner scanner;
	private boolean readinfoflag=false;
	private boolean addflag=false;
	private boolean viewflag=false;
	private boolean numfloorandTen=false;
	int idresidence=0;
	int idapart=0;
	int floornum=0;
	public boolean isReadinfoflag() {
		return readinfoflag;
	}
	public void setReadinfoflag(boolean readinfoflag) {
		this.readinfoflag = readinfoflag;
	}
	public boolean isAddflag() {
		return addflag;
	}
	public void setAddflag(boolean addflag) {
		this.addflag = addflag;
	}
	public boolean isViewflag() {
		return viewflag;
	}
	public void setViewflag(boolean viewflag) {
		this.viewflag = viewflag;
	}
	public boolean isNumfloorandTen() {
		return numfloorandTen;
	}
	public void setNumfloorandTen(boolean numfloorandTen) {
		this.numfloorandTen = numfloorandTen;
	}
	public boolean isViewapartflag() {
		return viewapartflag;
	}
	public void setViewapartflag(boolean viewapartflag) {
		this.viewapartflag = viewapartflag;
	}
	public boolean isC() {
		return c;
	}
	public void setC(boolean c) {
		this.c = c;
	}
	private boolean viewapartflag=false;
	private boolean c=false;

    public OwnerClass(Scanner scanner) {
        this.scanner = scanner;
    }
     public int choice;
    

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
            case 3:  numoftenant() ;
                     numoffloors() ;            
                       break;

            case 4: viewapatmen() ;
                      break;

       

            case 5:
                logger.info("Exiting the Housing Owner App. Goodbye!");
                break;
            default:
                logger.info("Invalid choice. Please try again.");
        }
    } while (choice != 5);

}
public void addresidence() {
	    readinfoflag = true;
        logger.info("Enter the id:");
        int iD = scanner.nextInt();
        scanner.nextLine();

        logger.info("Enter the location:");
        String location = scanner.nextLine();

        logger.info("Enter the photo:");
        String photo = scanner.nextLine();

        logger.info("Enter the rent:");
        double rent = scanner.nextDouble();
        scanner.nextLine();


        logger.info("Enter the number of floors:");
        int numberOfFloors = scanner.nextInt();
        scanner.nextLine();

        logger.info("Enter available services:");
        String availableServices = scanner.nextLine();

        logger.info("Is the residence for Students? (true/false):");
        boolean Studentflag = scanner.nextBoolean();
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

        Apartments A=new Apartments(floornum,ida ,tenantNames,meansOfCommunication,5,3,true);
        HousingUnit unit = new HousingUnit(iD, location, photo, rent, 0, numberOfFloors,
                                           availableServices, false, A, Studentflag);
        
        houseinfo.add(unit);
	    MyData.addAdvertisementList(unit);
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

    Apartments A1 = new Apartments(floornum1, ida1, tenantNames1, meansOfCommunication1, 5, 3, true);

    HousingUnit unit1 = new HousingUnit(iD1, location1, photo1, rent1, numberOfTenants1, numberOfFloors1,
            availableServices1, acceptflag1, A1,true);

    houseinfo.add(unit1);

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

    Apartments A2 = new Apartments(floornum2, ida2, tenantNames2, meansOfCommunication2, 4, 2, false);

    HousingUnit unit2 = new HousingUnit(iD2, location2, photo2, rent2, numberOfTenants2, numberOfFloors2,
            availableServices2, acceptflag2, A2,true);

    houseinfo.add(unit2);
}
public void viewresidences() {
	init();
	for (HousingUnit unit : houseinfo) {
		logger.info(unit + ", ");
    }
	viewflag=true;
	
}
public void numoftenant() {
	int num=0;
	logger.info("Enter the id of the residence: ");
     idresidence = scanner.nextInt();
    for(int i=1;i<=houseinfo.size();i++) {
    	if(idresidence==i) {
            num=houseinfo.get(i).getNumberOfTenants();
    	}
    }
    numfloorandTen =true;
    logger.info("The number of tenant is : "+num);	
}
public void numoffloors() {
	int N=0;
	for(int i=1;i<houseinfo.size();i++) {
    	if(idresidence==i) {
            N=houseinfo.get(i).getNumberOfFloors();
    	}
    numfloorandTen =true;
    logger.info(" and the number of floors is : "+N);	
    
}
}
public void viewapatmen() {
	ArrayList<Apartments> apartmentsList = new ArrayList<Apartments>();
    viewapartflag = true;

	System.out.println("Enter the number of floor:");
	int idf = scanner.nextInt();
    for (HousingUnit unit : houseinfo) {
        if (unit.getA().getFloor() == idf) {
        	Apartments apartment = unit.getA();
            apartmentsList.add(apartment);
            
        }
    }

    if (!apartmentsList.isEmpty()) {
        viewapartflag = true;

        for (Apartments apartment : apartmentsList) {
        	 logger.info("Floor Number: " + apartment.getFloor());
             logger.info("Number of Bathrooms: " + apartment.getNumberOfBathrooms());
             logger.info("Number of Bedrooms: " + apartment.getNumberOfBedrooms());
             logger.info("Balcony Availability: " + apartment.isHasBalcony());

             logger.info("Tenants in the Apartment:");
            List<String> tenantNames = apartment.getTenantNames();
            List<String> meansOfCommunication = apartment.getMeansOfCommunication();

            for (int i = 0; i < tenantNames.size(); i++) {
            	logger.info("Tenant Name: " + tenantNames.get(i));
            	logger.info("Means of Communication: " + meansOfCommunication.get(i));
            }

            logger.info("") ;       }
    } else {
    	logger.info("No apartments found on floor number " + idf);
    }

	viewapartflag=true;
	}   

    
}

