package housing.unit;

import java.util.ArrayList;
import java.util.List;

public class MyData {
	


	private boolean islog;
	private boolean passflag;
	private boolean eflag;
	
	public boolean isIslog() {
		return islog;
	}
	
	public boolean isPassflag() {
		return passflag;
	}
	
	public boolean isEflag() {
		return eflag;
	}
	
	private List<User> userinfo = new ArrayList<User>();
  public List<User> getUserinfo() {
		return userinfo;
	}
	
static List <HousingUnit> housingunitlist=new ArrayList<HousingUnit>() ;
   static List <HousingUnit> advertisementlist=new ArrayList<HousingUnit>() ;
   static List <HousingUnit> reservationslist=new ArrayList<HousingUnit>() ;
  
   public static void setHousingUnitList(List<HousingUnit> housingUnitList) {
	   housingunitlist = housingUnitList;
}
public static void setAdvertisementList(List<HousingUnit> advertisementList) {
	advertisementlist = advertisementList;
}
public static void setReservationsList(List<HousingUnit> reservationsList) {
	reservationslist = reservationsList;
}


public static void addReservationsList(HousingUnit unit) {
	reservationslist.add(unit);
}


public static void addHousingUnitList(HousingUnit unit) {
	housingunitlist.add(unit);
}

public static void addAdvertisementList(HousingUnit unit) {
	advertisementlist.add(unit);
}


   public static List<HousingUnit> getHousingUnitList() {
	return housingunitlist;
	    
	
   }
   public static List<HousingUnit> advertisementlist() {
	 
	   return advertisementlist;
	    
	
   }
	public void initarrayvalues() {
		 userinfo.add(new User("admin","samaa","samaa@gmail.com","4545",1));
	        userinfo.add(new User("tenant","malak","m@gmail.com","1234",1));
	        userinfo.add(new User("owner","nancy","N@gmail.com","4444",1));
	        userinfo.add(new User("admin","tala","tala@gmail.com","7676",1));
	} 
   
   public static List<HousingUnit> reservationslist() {
	return reservationslist;
	    
	
   }
public static List<HousingUnit> getAvilableHousing() {
	 List<HousingUnit> availableListings=new ArrayList<HousingUnit>();
	 for (HousingUnit house :  getHousingUnitList()) {
	        if (!house.isReservedFlag()) {
	             availableListings.add(house);
	        }
	       
	    }
	   return availableListings;
	   

}
  
    
}
