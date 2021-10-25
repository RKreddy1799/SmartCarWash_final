package proxy;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class ManageSmartwashProxy implements ManageSmartwash {
    private boolean isAdmin;
    private ManageSmartwashImplementation manageSmartwashImplementation;

    public ManageSmartwashProxy(String name, String pass) {
        if (name.equals("Admin") && pass.equals("123")) {
            isAdmin = true;
            manageSmartwashImplementation = new ManageSmartwashImplementation();
        }
    }

    @Override
    public void manageSmartwash() {
        if (isAdmin) {
            manageSmartwashImplementation.manageSmartwash();
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}

