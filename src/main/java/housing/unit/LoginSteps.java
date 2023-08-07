package housing.unit;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoginSteps {
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    MyData L = new MyData();
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

	public void setAdminflag(boolean adminflag) {
		this.adminflag = adminflag;
	}

	public boolean isTenantflag() {
		return tenantflag;
	}

	public void setTenantflag(boolean tenantflag) {
		this.tenantflag = tenantflag;
	}

	public boolean isOwnerflag() {
		return ownerflag;
	}

	public void setOwnerflag(boolean ownerflag) {
		this.ownerflag = ownerflag;
	}

	public void init() {
        L.initarrayvalues();
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
        for (int i = 0; i < L.userinfo.size(); i++) {
            if (L.userinfo.get(i).name.equals(username)) {
                nameflag = true;
                if (L.userinfo.get(i).pa.equals(password)) {
                    pasflag = true;
                    if (L.userinfo.get(i).role.equals("admin")) {
                        adminflag = true;
                    } else if (L.userinfo.get(i).role.equals("owner")) {
                        ownerflag = true;
                    } else if (L.userinfo.get(i).role.equals("tenant")) {
                        tenantflag = true;
                    }
                    break;
                }
            }
        }
        return nameflag && pasflag;
    }
}
