<<<<<<< HEAD
package housing.unit;

import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) { 
		 String s;
        Scanner scanner = new Scanner(System.in);
		LoginSteps LS;
		TenantClass t=new TenantClass(scanner);
		OwnerClass o=new OwnerClass(scanner);
		AdminClass a=new AdminClass();
		
		do {
		LS= new LoginSteps(scanner);
		LS.init();
		if(LS.adminflag)
			a.adminmenu();
		else if(LS.ownerflag)
			o.ownermenu();
		else if(LS.tenantflag) 
			t.tenantmenu();
		
		System.out.println("Close the App?");
		s=scanner.nextLine();
		
		}while(!s.equalsIgnoreCase("yes"));
        scanner.close();
	}
}
=======
package housing.unit;

import java.util.ArrayList;
import java.util.Scanner;

import Sakancom.AdminClass;
import Sakancom.Apartments;
import Sakancom.LoginSteps;
import Sakancom.OwnerClass;

public class MyApp {
	Apartments apartments;
   ArrayList <HousingUnit> HousingUnitList=new ArrayList<HousingUnit>() ;
                   
   public HousingUnit EnteredHouse =new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments);               
   
   public ArrayList<HousingUnit> getHousingUnitList() {
	   HousingUnitList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments));               
	return HousingUnitList;
	    
	
   }
  
    
   
   
   
	
	
	
}
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe
