package housing.unit;

import java.util.Scanner;
import java.util.logging.Logger;


public class LoginSteps {
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    MyData mydata = new MyData();
    private boolean adminflag = false;
    private boolean tenantflag = false;
    private boolean ownerflag = false;
    private Scanner scanner;

    public LoginSteps(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean isAdminflag() {
		return adminflag;
	}

	public boolean isTenantflag() {
		return tenantflag;
	}

	public boolean isOwnerflag() {
		return ownerflag;
	}

	public void init() {
        mydata.initarrayvalues();
        logger.info("=== Login System ===");
        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            logger.info("Enter username: ");
            String username = scanner.nextLine();
            logger.info("Enter password: ");
            String password = scanner.nextLine();
            isLoggedIn = checkCredentials(username, password);
            if (isLoggedIn) {
                logger.info("Login successful!");
            } else {
                logger.warning("Invalid username or password. Please try again.");
            }
        }
    }

    public boolean checkCredentials(String username, String password) {
        boolean nameflag = false;
        boolean pasflag = false;
        for (int i = 0; i < mydata.getUserinfo().size(); i++) {
            if (mydata.getUserinfo().get(i).getName().equals(username)) {
                nameflag = true;
                if (mydata.getUserinfo().get(i).getPa().equals(password)) {
                    pasflag = true;
                    if (mydata.getUserinfo().get(i).role.equals("admin")) {
                        adminflag = true;
                    } else if (mydata.getUserinfo().get(i).role.equals("owner")) {
                        ownerflag = true;
                    } else if (mydata.getUserinfo().get(i).role.equals("tenant")) {
                        tenantflag = true;
                    }
                    break;
                }
            }
        }
        return nameflag && pasflag;
    }
}
