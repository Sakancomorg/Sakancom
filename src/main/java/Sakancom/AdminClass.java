package Sakancom;

import java.util.Scanner;

public class AdminClass {
	private Scanner scanner;

    // Constructor that takes the shared Scanner object as a parameter
    public AdminClass(Scanner scanner) {
        this.scanner = scanner;
    }
	public void adminmenu() {
        int choice;
        do {
            System.out.println("========= Housing System Menu =========");
            System.out.println("1. View requests for advertisement");
            System.out.println("2. Accept a housing advertisement");
            System.out.println("3. Reject a housing advertisement");
            System.out.println("4. View reservations");
            System.out.println("5. Add and advertise a housing unit");
            System.out.println("6. Modify housing data");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");          
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                   // housingSystem.viewAdvertisementRequests();
                    break;
                case 2:
                   // housingSystem.acceptAdvertisement();
                    break;
                case 3:
                   // housingSystem.rejectAdvertisement();
                    break;
                case 4:
                   // housingSystem.viewReservations();
                    break;
                case 5:
                    //housingSystem.addAndAdvertiseHousingUnit();
                    break;
                case 6:
                   // housingSystem.modifyHousingData();
                    break;
                case 7:
                    System.out.println("Exiting the Housing System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        
        
	}

}
