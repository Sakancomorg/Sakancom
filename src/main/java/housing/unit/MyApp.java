package housing.unit;

import java.util.ArrayList;
import java.util.Scanner;

import Sakancom.AdminClass;
import Sakancom.Apartments;
import Sakancom.LoginSteps;
import Sakancom.OwnerClass;
import Sakancom.TenantClass;

public class MyApp {
	Apartments apartments;
   ArrayList <HousingUnit> HousingUnitList=new ArrayList<HousingUnit>() ;
                   
   public HousingUnit EnteredHouse =new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments);               
   
   public ArrayList<HousingUnit> getHousingUnitList() {
	   HousingUnitList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments));               
	return HousingUnitList;
	    
	
   }
  
    
   
   
   
	
	
	
}
