package housing.unit;

import java.util.ArrayList;

public class MyApp {

	
	
	
	
   ArrayList <HousingUnit> HousingUnitList=new ArrayList<HousingUnit>() ;
   
   public HousingUnit EnteredHouse =new HousingUnit("naf", "DD", 10, 11, 12, "fiber");
   
   public ArrayList<HousingUnit> getHousingUnitList() {
	   HousingUnitList.add(new HousingUnit("na", "DD", 10, 11, 12, "fiber"));
	return HousingUnitList;
	    
   }
  
   
   
   
	
	
	
}
