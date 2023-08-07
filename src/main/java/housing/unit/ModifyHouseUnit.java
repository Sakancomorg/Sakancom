package housing.unit;

import java.util.Scanner;
import java.util.logging.Logger;

public class ModifyHouseUnit {
    private static final Logger logger = Logger.getLogger(ModifyHouseUnit.class.getName());

    public static HousingUnit housingUnitToModify;
    public static HousingUnit housingUnitToModifyAfter;
    static int index;

    public static void modify() {
        logger.info("Enter the ID of the housing unit to modify: ");
        housingUnitToModify = HousingUnit.FindHouse(MyData.getHousingUnitList());
        if (housingUnitToModify == null) return;
        index = MyData.housingunitlist.indexOf(housingUnitToModify);
        Scanner scanner = new Scanner(System.in);
        if (housingUnitToModify == null) {
            logger.info("No housing unit found with the given ID.");
            return;
        }

        logger.info("Enter the new location: ");
        String newLocation = scanner.next();
        housingUnitToModify.setLocation(newLocation);

        logger.info("Enter the new photo: ");
        String newPhoto = scanner.next();
        housingUnitToModify.setPhoto(newPhoto);

        logger.info("Enter the new rent: ");
        double newRent = scanner.nextDouble();
        housingUnitToModify.setRent(newRent);

        logger.info("Enter the new number of floors: ");
        int newNumberOfFloors = scanner.nextInt();
        housingUnitToModify.setNumberOfFloors(newNumberOfFloors);

        logger.info("Enter the new available services: ");
        String newAvailableServices = scanner.next();

        logger.info("Is the residence for Students? (true/false):");
        boolean Studentflag = scanner.nextBoolean();
        scanner.nextLine();

        housingUnitToModify.setAvailableServices(newAvailableServices);

        logger.info("Housing unit with ID " + housingUnitToModify.getId() + " has been modified.");
    }

    public static void modifyAdmin() {
        HousingSystem.printData(MyData.getHousingUnitList());
        modify();
        if (housingUnitToModify == null) {
            logger.info("Not Found");
            return;
        }

        MyData.housingunitlist.set(index, housingUnitToModify);
        housingUnitToModifyAfter = MyData.housingunitlist.get(index);
    }
}
