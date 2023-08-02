package Sakancom;

import java.util.Scanner;

import housing.unit.TenantSystem;

public class TenantClass {
	private Scanner scanner;

    // Constructor that takes the shared Scanner object as a parameter
    public TenantClass(Scanner scanner) {
        this.scanner = scanner;
    }
	
	static public void tenantmenu() {
	
	Scanner scanner = new Scanner(System.in);
    int choice;
    do {
        System.out.println("========= Tenant Menu =========");
        System.out.println("1. View available housing");
        System.out.println("2. Advertise used furniture for sale");
        System.out.println("3. View tenant control panel");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
            	
                TenantSystem.viewAvailableHousing();
                System.out.println("View housing details and pictures?");
                String s=scanner.nextLine();
                if(s.equalsIgnoreCase("yes"))
            	TenantSystem.viewHousingDetails();
            	
                 System.out.println("3. Book accommodation");
                
                break;
            case 2:
               // tenantSystem.viewHousingDetails();
                break;
            case 3:
               // tenantSystem.bookAccommodation();
                break;
           
            case 4:
                System.out.println("Exiting the Tenant App. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 4);

    scanner.close();
	}
}

