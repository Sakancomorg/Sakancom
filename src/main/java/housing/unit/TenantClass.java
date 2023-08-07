package housing.unit;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class TenantClass {
    private static final Logger logger = Logger.getLogger(TenantClass.class.getName());

    private Scanner scanner;
    private boolean seladv = false;
    private boolean viewpersonaldataf = false;
    private boolean viewtimetopayf = false;
    String username;
    String e;
    private boolean advflag = false;
    Book bookInstance;
    private int choice;
    int ch;
    ArrayList<HousingUnit> tenanthouseinfo = new ArrayList<HousingUnit>();

    public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public TenantClass(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean isSeladv() {
        return seladv;
    }

    public void setSeladv(boolean seladv) {
        this.seladv = seladv;
    }

    public void tenantmenu() {
         scanner = new Scanner(System.in);
        do {
            logger.info("========= Tenant Menu =========");
            logger.info("1. View available housing");
            logger.info("2. Advertise used furniture for sale");
            logger.info("3. View tenant control panel");
            logger.info("4. Exit");
            logger.info("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    TenantSystem.viewAvailableHousing();
                    logger.info("Do you want to book a house unit");
                    String s = scanner.nextLine();
                    if (s.equalsIgnoreCase("yes"))
                        TenantSystem.book();
                    break;
                case 2:
                    seladv = true;
                    viewadvertisementwindow();
                    break;
                case 3:
                    viewTenantControlPanel();
                    break;
                case 4:
                    logger.info("Exiting the Tenant App. Goodbye!");
                    break;
                default:
                    logger.info("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public void viewadvertisementwindow() {
        ArrayList<Furniture> furnitureList = new ArrayList<Furniture>();
        Furniture furniture1 = new Furniture("Sofa", "Living Room", "Comfortable three-seater sofa", 500.0, "cot@example.com");
        Furniture furniture2 = new Furniture("Dining Table", "Dining Room", "Wooden dining table with 4 chairs", 300.0, "contact@example.com");
        Furniture furniture3 = new Furniture("Bed", "Bedroom", "King-size bed with memory foam mattress", 800.0, "sss@example.com");

        furnitureList.add(furniture1);
        furnitureList.add(furniture2);
        furnitureList.add(furniture3);

        logger.info("===== Furniture Advertisements =====");
        for (Furniture furniture : furnitureList) {
            logger.info("Furniture Name: " + furniture.getFurnitureName());
            logger.info("Furniture Category: " + furniture.getFurnitureCategory());
            logger.info("Description: " + furniture.getDescription());
            logger.info("Price: " + furniture.getPrice());
            logger.info("Contact Info: " + furniture.getContactInfo());
            logger.info("-----------------------------------");
        }
        setAdvflag(true);
    }

    public void viewTenantControlPanel() {
        do {
            logger.info("===== Tenant Control Panel =====\n");
            logger.info("1. View tenant personal data\n");
            logger.info("2. View The name of the residence owner and his contact information\n");
            logger.info("3. When the rent is paid\n");
            logger.info("4. Exit\n");
            ch = scanner.nextInt();
            scanner.nextLine();

            switch (ch) {
                case 1:
                    viewpersonaldata();
                    break;
                case 2:
                    viewownerinfo();
                    break;
                case 3:
                    viewtimetopay();
                    break;
                case 4:
                    logger.info("Exiting the Tenant Control Panel");
                    break;
                default:
                    logger.info("Invalid choice. Please try again.");
            }
        } while (ch != 4);
    }

    public void init() {
        double rent = 1500.0;
        Time time = new Time(System.currentTimeMillis());
        String ownername = "John Smith";
        int number = 1234567890;
        String email = "john@example.com";
        bookInstance = new Book(rent, time, ownername, number, email);
    }

    public void viewpersonaldata() {
        logger.info("Role: Tenant");
        String userInfo = String.format("User Name: %s", username);
        logger.info(userInfo);
        String emailInfo = String.format("Email: %s", e);
        logger.info(emailInfo);
        viewpersonaldataf = true;
    }

    public void viewtimetopay() {
        init();
        Time timeToPay = bookInstance.getTime();
        String timeToPayInfo = String.format("Time to Pay: %s", timeToPay);
        logger.info(timeToPayInfo);
        viewtimetopayf = true;
    }

    public void viewownerinfo() {
        init();
        logger.info("Owner Name: " + bookInstance.getOwnername());
        logger.info("Phone Number: " + bookInstance.getNumber());
        logger.info("Email: " + bookInstance.getEmail());
        viewpersonaldataf = true;
    }

    public boolean isViewpersonaldataf() {
        return viewpersonaldataf;
    }

    public void setViewpersonaldataf(boolean viewpersonaldataf) {
        this.viewpersonaldataf = viewpersonaldataf;
    }

    public boolean isViewtimetopayf() {
        return viewtimetopayf;
    }

    public void setViewtimetopayf(boolean viewtimetopayf) {
        this.viewtimetopayf = viewtimetopayf;
    }

    public boolean isAdvflag() {
        return advflag;
    }

    public void setAdvflag(boolean advflag) {
        this.advflag = advflag;
    }
}
