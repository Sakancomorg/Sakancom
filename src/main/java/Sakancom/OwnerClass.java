package Sakancom;

import java.util.ArrayList;
import java.util.Scanner;

import housing.unit.HousingUnit;
import io.cucumber.java.bs.A;

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
    public OwnerClass(Scanner scanner) {
        this.scanner = scanner;
    }
     int choice;
    

public void ownermenu() {

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
            case 1:
            	addresidence();
                break;
            case 2:
            	viewresidences();
                break;
            case 3:  numoftenant() ;
                     numoffloors() ;            
                       break;

            case 4: viewapatmen() ;
                      break;

            case 5:  break;


            case 6:
                System.out.println("Exiting the Housing Owner App. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 6);

}
public void addresidence() {
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

        System.out.println("Enter the number of tenants:");
        int numberOfTenants = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the number of floors:");
        int numberOfFloors = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter available services:");
        String availableServices = scanner.nextLine();

        System.out.println("Is the residence accepted? (true/false):");
        boolean acceptflag = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter the number of floor:");
        floornum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the id of apartment:");
        int ida = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter tenant Names:");
        String n=  scanner.nextLine();
        tenantNames.add(n);
        System.out.println("Enter the means Of Communication: ");
        String comm=  scanner.nextLine();
        meansOfCommunication.add(comm);

        Apartments A=new Apartments(floornum,ida ,tenantNames,meansOfCommunication,5,3,true);
        HousingUnit unit = new HousingUnit(iD, location, photo, rent, numberOfTenants, numberOfFloors,
                                           availableServices, acceptflag, A);
        
        houseinfo.add(unit);
	    
	    addflag = true;
	}


public void viewresidences() {
	for (HousingUnit unit : houseinfo) {
        System.out.println(unit + ", ");
    }
	viewflag=true;
	
}
public void numoftenant() {
	int num=0;
    System.out.println("Enter the id of the residence: ");
     idresidence = scanner.nextInt();
    for(int i=0;i<=houseinfo.size();i++) {

    	if(idresidence==i) {
            num=houseinfo.get(i).getNumberOfTenants();
    	}
    }
    numfloorandTen =true;
    System.out.println("The number of tenant is : "+num);	
}
public void numoffloors() {
	int N=0;
	for(int i=0;i<houseinfo.size();i++) {
    	if(idresidence==i) {
            N=houseinfo.get(i).getNumberOfFloors();
    	}
    numfloorandTen =true;
    System.out.println(" and the number of floors is : "+N);	
    
}
}
public void viewapatmen() {
	ArrayList<Apartments> apartmentsList = new ArrayList<Apartments>();

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

