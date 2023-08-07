package housing.unit;

import java.util.Scanner;
import java.util.logging.Logger;

public class AdminClass {
    private static final Logger logger = Logger.getLogger(AdminClass.class.getName());
    private static Scanner scanner = new Scanner(System.in);
    private int choice;
    private Boolean re;

    public void adminmenu() {
        do {
            logger.info("========= Housing System Menu =========");
            logger.info("1. View requests for advertisement");
            logger.info("2. View reservations");
            logger.info("3. Add a housing unit");
            logger.info("4. Modify housing unit");
            logger.info("5. Exit");
            logger.info("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    HousingSystem.viewAdvertisementRequest();
                    break;
                case 2:
                    HousingSystem.viewReservations();
                    re = true;
                    break;
                case 3:
                    HousingSystem.addUnit();
                    break;
                case 4:
                    HousingSystem.modifyHousingData();
                    break;
                case 5:
                    logger.info("Exiting the Housing System. Goodbye!");
                    break;
                default:
                    logger.warning("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

	public Boolean getRe() {
		return re;
	}

	public void setRe(Boolean re) {
		this.re = re;
	}
}
