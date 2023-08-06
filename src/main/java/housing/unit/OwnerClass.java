package housing.unit;

import java.util.ArrayList;

import java.util.Scanner;


public class OwnerClass {
	ArrayList<HousingUnit> houseinfo = new ArrayList<HousingUnit>();
	ArrayList<String> tenantNames = new ArrayList<String>();
	ArrayList<String> meansOfCommunication = new ArrayList<String>();
	Apartments A;
	private Scanner scanner;
	public boolean readinfoflag=false;
	public boolean addflag=false;
	public boolean viewflag=false;
	public boolean numfloorandTen=false;
	int idresidence=0;
	int idapart=0;
	int floornum=0;
	public boolean viewapartflag=false;
	public boolean c=false;

    public OwnerClass(Scanner scanner) {
        this.scanner = scanner;
    }
     public int choice;
    

public  void ownermenu() {

    do {
        System.out.println("========= Housing Owner Menu =========");
        System.out.println("1. Add a private residence");
        System.out.println("2. View listed residences");
        System.out.println("3. display the number of tenants and floors in specific residence ");
        System.out.println("4. The names of the tenants and their contact information and the number of bathrooms and bedrooms, and balcony availability should be displayed ");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
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
                System.out.println("Exiting the Housing Owner App. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 5);

}
public void addresidence() {
	//init();
	    readinfoflag = true;
	    System.out.println("Enter the id:");
        int iD = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the location:");
        String location = scanner.nextLine();

        System.out.println("Enter the photo:");
        String photo = scanner.nextLine();

        System.out.println("Enter the rent:");
        double rent = scanner.nextDouble();
        scanner.nextLine();

       /* System.out.println("Enter the number of tenants:");
        int numberOfTenants = scanner.nextInt();
        scanner.nextLine();
        */

        System.out.println("Enter the number of floors:");
        int numberOfFloors = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter available services:");
        String availableServices = scanner.nextLine();

        System.out.println("Is the residence for Students? (true/false):");
        boolean Studentflag = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter the number of floor:");
        floornum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the id of apartment:");
        int ida = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter tenant Names:");
       /* String n=  scanner.nextLine();
        tenantNames.add(n);*/
        System.out.println("Enter the means Of Communication: ");
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

    // Create Apartments object for the first HousingUnit
    int floornum1 = 2;
    int ida1 = 101;
    ArrayList<String> tenantNames1 = new ArrayList<String>();
    tenantNames1.add("John Doe");
    ArrayList<String> meansOfCommunication1 = new ArrayList<String>();
    meansOfCommunication1.add("Email");

    Apartments A1 = new Apartments(floornum1, ida1, tenantNames1, meansOfCommunication1, 5, 3, true);

    // Create HousingUnit object with the set values for Example 1
    HousingUnit unit1 = new HousingUnit(iD1, location1, photo1, rent1, numberOfTenants1, numberOfFloors1,
            availableServices1, acceptflag1, A1,true);

    // Add the first unit to the houseinfo list
    houseinfo.add(unit1);

    // Example 2: Set values for the second HousingUnit
    int iD2 = 2;
    String location2 = "123 Main Street";
    String photo2 = "house.jpg";
    double rent2 = 1800.0;
    int numberOfTenants2 = 3;
    int numberOfFloors2 = 1;
    String availableServices2 = "Swimming pool, Security";
    boolean acceptflag2 = false;

    // Create Apartments object for the second HousingUnit
    int floornum2 = 1;
    int ida2 = 102;
    ArrayList<String> tenantNames2 = new ArrayList<String>();
    tenantNames2.add("Jane Smith");
    ArrayList<String> meansOfCommunication2 = new ArrayList<String>();
    meansOfCommunication2.add("Phone");

    Apartments A2 = new Apartments(floornum2, ida2, tenantNames2, meansOfCommunication2, 4, 2, false);

    // Create HousingUnit object with the set values for Example 2
    HousingUnit unit2 = new HousingUnit(iD2, location2, photo2, rent2, numberOfTenants2, numberOfFloors2,
            availableServices2, acceptflag2, A2,true);

    // Add the second unit to the houseinfo list
    houseinfo.add(unit2);
}
public void viewresidences() {
	init();
	for (HousingUnit unit : houseinfo) {
        System.out.println(unit + ", ");
    }
	viewflag=true;
	
}
public void numoftenant() {
	int num=0;
    System.out.println("Enter the id of the residence: ");
     idresidence = scanner.nextInt();
    for(int i=1;i<=houseinfo.size();i++) {
    	if(idresidence==i) {
            num=houseinfo.get(i).getNumberOfTenants();
    	}
    }
    numfloorandTen =true;
    System.out.println("The number of tenant is : "+num);	
}
public void numoffloors() {
	int N=0;
	for(int i=1;i<houseinfo.size();i++) {
    	if(idresidence==i) {
            N=houseinfo.get(i).getNumberOfFloors();
    	}
    numfloorandTen =true;
    System.out.println(" and the number of floors is : "+N);	
    
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
            System.out.println("Floor Number: " + apartment.getFloor());
            System.out.println("Number of Bathrooms: " + apartment.getNumberOfBathrooms());
            System.out.println("Number of Bedrooms: " + apartment.getNumberOfBedrooms());
            System.out.println("Balcony Availability: " + apartment.isHasBalcony());

            System.out.println("Tenants in the Apartment:");
            ArrayList<String> tenantNames = apartment.getTenantNames();
            ArrayList<String> meansOfCommunication = apartment.getMeansOfCommunication();

            for (int i = 0; i < tenantNames.size(); i++) {
                System.out.println("Tenant Name: " + tenantNames.get(i));
                System.out.println("Means of Communication: " + meansOfCommunication.get(i));
            }

            System.out.println(); // Add a new line to separate different apartments
        }
    } else {
        System.out.println("No apartments found on floor number " + idf);
    }

	viewapartflag=true;
	}   

    
}

