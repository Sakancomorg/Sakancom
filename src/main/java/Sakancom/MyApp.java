package Sakancom;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		LoginSteps LS= new LoginSteps(scanner);
		OwnerClass o=new OwnerClass(scanner);
		String n;


		LS.init();
		if(LS.adminflag) {
			AdminClass a=new AdminClass(scanner);
			a.adminmenu();
				
		}
		else if(LS.ownerflag) {
			//OwnerClass O=new OwnerClass(scanner);
			o.ownermenu();
			
		}
		else if(LS.tenantflag) {
			TenantClass T=new TenantClass(scanner);
			T.username=LS.getUsername();
			T.e=LS.getE();
			T.tenantmenu();
			
		}
		
        scanner.close();
	}

}
