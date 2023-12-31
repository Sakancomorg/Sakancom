package housing.unit;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class HousingSystem {

    private static final Logger logger = Logger.getLogger(HousingSystem.class.getName());

    static Scanner scanner = new Scanner(System.in);
    static List<HousingUnit> advertisementlist = MyData.advertisementlist();
    static List<HousingUnit> housingunitlist = MyData.getHousingUnitList();

    public static void printData(List<HousingUnit> list) {
        for (HousingUnit house : list) {
            String houseInfo = String.format("ID: %d%nLocation: %s%nPhoto: %s%nRent: %.2f%nNumber of Floors: %d%nAvailable Services: %s%nStudent House: %b%n",
                house.getLocationInfo().getId(), house.getLocationInfo().getLocation(), house.getLocationInfo().getPhoto(), house.getLocationInfo().getRent(), house.getNumoffloors(),
                house.getAvailableServices(), house.isStudentHouse());
            logger.info(houseInfo);
        }
    }


    public static void viewReservations() {
        printData(MyData.reservationslist());
        if (MyData.reservationslist().isEmpty()) {
            logger.info("No Reservations");
     
        }
    }

    public static void modifyHousingData() {
        ModifyHouseUnit.modifyAdmin();
    }

    public void exit() {
        logger.info("Exiting the Housing System. Goodbye!");
    }

    public static HousingUnit addUnit() {
        logger.info("Enter the id:");
        int iDd = scanner.nextInt();
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
        boolean studentflag = scanner.nextBoolean();
        scanner.nextLine();

        Apartments ap = new Apartments();
        LocationInfo locationInfos = new LocationInfo(location, photo, rent, iDd);

        HousingUnit house = new HousingUnit(locationInfos, ap, true, studentflag,numberOfFloors,availableServices);

        MyData.addHousingUnitList(house);
        logger.info("The unit is added");
        return house;
    }

    public static void viewAdvertisementRequest() {
        HousingSystem.printData(advertisementlist);
        if (advertisementlist.isEmpty()) {
            logger.info("No new Advertisement requests");
          
        }
        else {
        logger.info("1. Accept a housing advertisement");
        logger.info("2. Reject a housing advertisement");
        int decision = Integer.parseInt(scanner.next());
        logger.info("Enter the ID");
        if (decision == 1)
            acceptAdvertisementRequest();
        else if (decision == 2)
           rejectAdvertisementRequest();
        }
    }

    static HousingUnit findHouse(List<HousingUnit> list) {
        int ids = Integer.parseInt(scanner.next()); 
        HousingUnit houseR = null;
        for (HousingUnit house : list) {
            if (house.getLocationInfo().getId() == ids) {
                houseR = house;
            }
        }
        return houseR;
    }

    public static HousingUnit acceptAdvertisementRequest() {
        HousingUnit houseR = findHouse(advertisementlist);
        advertisementlist.remove(houseR);
        housingunitlist.add(houseR);
        MyData.setHousingUnitList(housingunitlist);
        logger.info("Advertisement Accepted");
        return houseR;
    }

    public static HousingUnit rejectAdvertisementRequest() {
        HousingUnit houseR = findHouse(advertisementlist);
        advertisementlist.remove(houseR);
        logger.info("Advertisement Rejected");
        return houseR;
    }
}
