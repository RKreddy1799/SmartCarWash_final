package strategy;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;


public class HatchbackCars implements Cars {
    @Override
    public void calculateSmartwashCars() {
        System.out.println("Hatchback are washed in 15 min for 25$");
    }
}
