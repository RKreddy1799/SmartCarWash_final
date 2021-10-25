package strategy;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;


public class SuvCars implements Cars {
    @Override
    public void calculateSmartwashCars() {
        System.out.println("Suv cars take 30 min for cleaning for 45$");
    }
}
