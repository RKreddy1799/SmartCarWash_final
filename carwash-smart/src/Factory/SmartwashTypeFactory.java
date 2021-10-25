package Factory;
import Factory.*;
import driver.*;
import proxy.*;
import singleton.*;
import strategy.*;

public class SmartwashTypeFactory {
    public SmartwashType getInstance(String type) {
        if (type.equals("recycle")) {
            return new ExteriorSmartwash();
        } else {
            return new InteriorSmartwash();
        }
    }
}
