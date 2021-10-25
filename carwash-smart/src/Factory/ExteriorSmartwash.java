package Factory;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class ExteriorSmartwash implements SmartwashType {
    @Override
    public void carsSmartwash() {
        System.out.println("Exterior smartcarwash is ongoing !!");
    }
}
