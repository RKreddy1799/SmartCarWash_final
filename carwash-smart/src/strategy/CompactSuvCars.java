package strategy;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;


public class CompactSuvCars implements Cars {
    @Override
    public void calculateSmartwashCars() {
        System.out.println("CompactSuv cars are cleaned in 20min for 30$");
    }
}