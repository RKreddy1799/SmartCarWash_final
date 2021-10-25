package singleton;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class Context {
    private Cars cars;

    public Context(Cars cars) {
        this.cars = cars;
    }

    public void displayCars() {
        cars.calculateSmartwashCars();
    }
}
