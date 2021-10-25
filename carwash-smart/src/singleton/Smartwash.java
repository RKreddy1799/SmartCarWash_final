package singleton;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class Smartwash {
    private static Smartwash smartwash = new Smartwash();

    private Smartwash() {

    }

    public static Smartwash getInstance() {
        return smartwash;
    }

    public void printMenu() {
        System.out.println("1. Car smartwash");
        System.out.println("2. pricing");
        System.out.println("3. Manage smartwash");
        System.out.println("4. Exit");
    }

    public void carsSmartwash(String type) {
        SmartwashTypeFactory smartwashTypeFactory = new SmartwashTypeFactory();
        SmartwashType smartwashType = smartwashTypeFactory.getInstance(type);
        smartwashType.carsSmartwash();
    }

    public void displayCars(int which) {
        if (which == 1) {
            Context context = new Context(new HatchbackCars());
            context.displayCars();
        }
        if (which == 2) {
            Context context = new Context(new CompactSuvCars());
            context.displayCars();
        }
        if (which == 3) {
            Context context = new Context(new SuvCars());
            context.displayCars();
        }
    }

    public void manageSmartwash(String name, String pass) {
        ManageSmartwashProxy manageSmartwashProxy = new ManageSmartwashProxy(name, pass);
        manageSmartwashProxy.manageSmartwash();
    }
}


