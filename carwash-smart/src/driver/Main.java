package driver;
import Factory.*;
import proxy.*;
import singleton.*;
import strategy.*;


import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Smartwash smartwash = Smartwash.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            smartwash.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                System.out.println("Select wash type to cars:");
                System.out.println("1. Exterior smartwash");
                System.out.println("2. Interior smartwash");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    smartwash.carsSmartwash("new");
                } else {
                    smartwash.carsSmartwash("old");
                }
            }
            if (option == 2) {
                System.out.println("Which cars you want to see ?");
                System.out.println("1. Hatchback");
                System.out.println("2. Compact Suv");
                System.out.println("3. Suv");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                smartwash.displayCars(selection);

            }
            if (option == 3) {
                System.out.println("Login as an admin to control smartwash software");
                System.out.println("1. Yes\n2. No");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    System.out.print("Enter name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    smartwash.manageSmartwash(user, pass);
                } else {
                    System.out.println("You can only control smartwash as an Admin!");
                }
            }
        }
    }
}
