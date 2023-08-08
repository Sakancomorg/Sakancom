
package housing.unit;

import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) { 
		 String s;
        Scanner scanner = new Scanner(System.in);
		LoginSteps ls;
		TenantClass t=new TenantClass(scanner);
		OwnerClass o=new OwnerClass(scanner);
		AdminClass a=new AdminClass();
		
		do {
		ls= new LoginSteps(scanner);
		ls.init();
		if(ls.isAdminflag())
			a.adminmenu();
		else if(ls.isOwnerflag())
			o.ownermenu();
		else if(ls.isTenantflag()) 
			t.tenantmenu();
		
		System.out.println("Close the App?");
		s=scanner.nextLine();
		
		}while(!s.equalsIgnoreCase("yes"));
        scanner.close();
	}
}
