package housing.unit;

import java.awt.print.Book;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;


import housing.unit.TenantSystem;

import housing.unit.HousingUnit;


public class TenantClass {
	private Scanner scanner;
	private boolean seladv =false;
	private boolean viewpersonaldataf=false;
	private boolean viewtimetopayf=false;
	String username;
	String e;

	 private boolean advflag =false;
	 book bookInstance;
	 LoginSteps L=new LoginSteps(scanner);
    public int choice;
    int ch;
	ArrayList<HousingUnit> tenanthouseinfo = new ArrayList<HousingUnit>();
	


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

	Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("========= Tenant Menu =========");
        System.out.println("1. View available housing");
        System.out.println("2. Advertise used furniture for sale");
        System.out.println("3. View tenant control panel");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:

            	 TenantSystem.viewAvailableHousing();
                 
                 System.out.println("Do you want to book a house unit");
                 String s=scanner.nextLine();
                 if(s.equalsIgnoreCase("yes"))
                	 TenantSystem.book();
               
                break;
            case 2:{
            	seladv=true;
            	viewadvertisementwindow();
                break;
            }
            	
            case 3:
            	viewTenantControlPanel();
                break;
            case 4:

                System.out.println("Exiting the Tenant App. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 4);

    
	}

	public void viewadvertisementwindow() {
		ArrayList<Furniture> furnitureList = new ArrayList<Furniture>();
		// TODO Auto-generated method stub
		Furniture furniture1 = new Furniture("Sofa", "Living Room", "Comfortable three-seater sofa", 500.0, "contact@example.com");
        Furniture furniture2 = new Furniture("Dining Table", "Dining Room", "Wooden dining table with 4 chairs", 300.0, "contact@example.com");
        Furniture furniture3 = new Furniture("Bed", "Bedroom", "King-size bed with memory foam mattress", 800.0, "contact@example.com");

        furnitureList.add(furniture1);
        furnitureList.add(furniture2);
        furnitureList.add(furniture3);
		System.out.println("===== Furniture Advertisements =====");
	    for (Furniture furniture : furnitureList) {
	        System.out.println("Furniture Name: " + furniture.getFurnitureName());
	        System.out.println("Furniture Category: " + furniture.getFurnitureCategory());
	        System.out.println("Description: " + furniture.getDescription());
	        System.out.println("Price: " + furniture.getPrice());
	        System.out.println("Contact Info: " + furniture.getContactInfo());
	        System.out.println("-----------------------------------");
	    }
		setAdvflag(true);

	}
	public void  viewTenantControlPanel() {
		do {
		System.out.println("===== Tenant Control Panel =====\n");
		System.out.println("1. View tenant personal data\n");
		System.out.println("2. View The name of the residence owner and his contact information\n");
		System.out.println("3. When the rent is paid\n");
		System.out.println("3. Exit\n");
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
            System.out.println("Exiting the Tenant Control Panel");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
        
        }

		
		}while (ch != 4);
		
		
	}
public void init() {
	double rent = 1500.0;
    Time time = new Time(System.currentTimeMillis());
    String ownername = "John Smith";
    int number = 1234567890;
    String email = "john@example.com";
     bookInstance = new book(rent, time, ownername, number, email);
		
	}

	public void viewpersonaldata() {
        System.out.println("Role: Tenant" );
        System.out.println("User Name: " +username);
        System.out.println("Email: " +e);
        viewpersonaldataf=true;
			
	}

	public void viewtimetopay() {
		init();
		 Time timeToPay = bookInstance.getTime();
	     System.out.println("Time to Pay: " + timeToPay);	
	     viewtimetopayf =true;
	}

	public void viewownerinfo() {
		init();
        System.out.println("Owner Name: " + bookInstance.getOwnername());
        System.out.println("Phone Number: " + bookInstance.getNumber());
        System.out.println("Email: " + bookInstance.getEmail());
        viewpersonaldataf=true;
		
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

