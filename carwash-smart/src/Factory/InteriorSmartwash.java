package Factory;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class InteriorSmartwash implements SmartwashType {
    @Override
    public void carsSmartwash() {
        System.out.println("interior cleaning is being done");
    }
}
