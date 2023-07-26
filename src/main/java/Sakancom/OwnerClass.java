package Sakancom;

import java.util.Scanner;

public class OwnerClass {
	private Scanner scanner;

    // Constructor that takes the shared Scanner object as a parameter
    public OwnerClass(Scanner scanner) {
        this.scanner = scanner;
    }
public void ownermenu() {

    int choice;
    do {
        System.out.println("========= Housing Owner Menu =========");
        System.out.println("1. Add a private residence");
        System.out.println("2. View owner dashboard");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
              //  ownerSystem.addPrivateResidence();
                break;
            case 2:
              //  ownerSystem.viewOwnerDashboard();
                break;
            case 3:
                System.out.println("Exiting the Housing Owner App. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 3);

}
}
