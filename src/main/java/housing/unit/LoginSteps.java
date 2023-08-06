package housing.unit;
import java.util.Scanner;

public class LoginSteps {
	MyData L=new MyData();
	public boolean adminflag=false;
	public boolean tenantflag=false;
	public boolean ownerflag=false;
	private Scanner scanner;
	public LoginSteps (Scanner scanner){
        this.scanner = scanner;
	}
	
	    public void init() {
	    	L.initarrayvalues();
	        System.out.println("=== Login System ===");
	        boolean isLoggedIn = false;
	        while (!isLoggedIn) {
	            System.out.print("Enter username: ");
	            String username = scanner.nextLine();
	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();
	            isLoggedIn = checkCredentials(username, password);
	            if (isLoggedIn) {
	                System.out.println("Login successful!");
	            } else {
	                System.out.println("Invalid username or password. Please try again.");
	            }
	        }

	    }

	    public boolean checkCredentials(String username, String password) {
	    	boolean nameflag=false;
	    	boolean pasflag=false;
	    	for(int i=0 ;i<L.userinfo.size();i++) {
	    		if(L.userinfo.get(i).name.equals(username)) {
	    			nameflag=true;
		    		if(L.userinfo.get(i).pa.equals(password)) {
		    			pasflag=true;
		    			if(L.userinfo.get(i).role.equals("admin")) {
		    				adminflag=true;
		    			}
		    			else if (L.userinfo.get(i).role.equals("owner")) {
		    				ownerflag=true;
		    			}
		    			else if (L.userinfo.get(i).role.equals("tenant")) {
		    				tenantflag=true;
		    			}
		    			
		    			break;
		    		}

	    		}
	    	}
	    	
	    	return nameflag&&pasflag;
	    }
	


}
