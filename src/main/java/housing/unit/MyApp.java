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
