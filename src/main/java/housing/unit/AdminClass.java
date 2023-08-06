package housing.unit;

import java.util.Scanner;

public class AdminClass {
	static Scanner scanner = new Scanner(System.in);
	static int choice;
	public static Boolean re;
	public void adminmenu() {
        do {
            System.out.println("========= Housing System Menu =========");
            System.out.println("1. View requests for advertisement");
            System.out.println("2. View reservations");
            System.out.println("3. Add a housing unit");
            System.out.println("4. Modify housing unit");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");          
            
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                	 HousingSystem.viewAdvertisementRequest();
                    break;
                case 2:
                	 HousingSystem.viewReservations();
                	 re=true;
                    break;
                case 3:
                	HousingSystem.addUnit();
                    break;
                case 4:
                         HousingSystem. modifyHousingData();
                    break;
                case 5:
                    System.out.println("Exiting the Housing System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        
	}
	


}
