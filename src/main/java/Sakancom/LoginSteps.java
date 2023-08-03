package Sakancom;
import java.util.Scanner;

public class LoginSteps {
	Log L=new Log();
	public boolean adminflag=false;
	public boolean tenantflag=false;
	public boolean ownerflag=false;
	private Scanner scanner;
	private String username;
	private String password;
	private String role;
	private String E;




	public LoginSteps (Scanner scanner){
        this.scanner = scanner;

	}
	
	    public void init() {
	    	L.initarrayvalues();

	        System.out.println("=== Login System ===");
	        boolean isLoggedIn = false;

	        while (!isLoggedIn) {
	            System.out.print("Enter username: ");
	             username = scanner.nextLine();

	            System.out.print("Enter password: ");
	             password = scanner.nextLine();

	            isLoggedIn = checkCredentials(username, password);

	            if (isLoggedIn) {
	                System.out.println("Login successful!");
	            } else {
	                System.out.println("Invalid username or password. Please try again.");
	            }
	        }

	    }

	    public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

	
		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
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
		    				role="admin";
		    				E=L.userinfo.get(i).emaill;
		    			}
		    			else if (L.userinfo.get(i).role.equals("owner")) {
		    				ownerflag=true;
		    				role="owner";
		    				E=L.userinfo.get(i).emaill;

		    			}
		    			else if (L.userinfo.get(i).role.equals("tenant")) {
		    				tenantflag=true;
		    				role="tenant";
		    				E=L.userinfo.get(i).emaill;

		    			}
		    			
		    			break;
		    		}

	    		}
	    	}
	    	
	    	return nameflag&&pasflag;
	    }

		public String getE() {
			return E;
		}

		public void setE(String e) {
			E = e;
		}

	
	


}
