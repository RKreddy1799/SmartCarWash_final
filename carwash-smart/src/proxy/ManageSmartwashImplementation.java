package proxy;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class ManageSmartwashImplementation implements ManageSmartwash {
    @Override
    public void manageSmartwash() {
        System.out.println("Smartwash login has been approved by admin!");
    }
}
