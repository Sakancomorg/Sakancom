package Sakancom;

import java.util.ArrayList;
import java.util.Scanner;

import housing.unit.HousingUnit;

public class TenantClass {
	private Scanner scanner;
    int choice;
    boolean viewavailablehousef=false;
    boolean viewselcethousef=false;
    boolean book=false;
    boolean viewflag=false;
	ArrayList<HousingUnit> tenanthouseinfo = new ArrayList<HousingUnit>();



    // Constructor that takes the shared Scanner object as a parameter
    public TenantClass(Scanner scanner) {
        this.scanner = scanner;
    }
	
	public void tenantmenu() {

	Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("========= Tenant Menu =========");
        System.out.println("1. View available housing");
        System.out.println("2. View housing details and pictures");
        System.out.println("3. Book accommodation");
        System.out.println("4. View information about housemates");
        System.out.println("5. Advertise used furniture for sale");
        System.out.println("6. View tenant control panel");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
            	viewavailablehouse();
                break;
            case 2:
               // tenantSystem.viewHousingDetails();
                break;
            case 3:
               // tenantSystem.bookAccommodation();
                break;
            case 4:
               // tenantSystem.viewHousematesData();
                break;
            case 5:
                //tenantSystem.advertiseUsedFurniture();
                break;
            case 6:
               // tenantSystem.viewTenantControlPanel();
                break;
            case 7:
                System.out.println("Exiting the Tenant App. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 7);

    scanner.close();
	}

	public void viewavailablehouse() {
		// TODO Auto-generated method stub
		
	}

	public void viewselcethouse() {
		// TODO Auto-generated method stub
		viewselcethousef=true;
		
	}

	public void book() {
		// TODO Auto-generated method stub
		book=true;
		
	}
	
	
	
}

