package driver;
import Factory.*;
import proxy.*;
import singleton.*;
import strategy.*;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Testing {

    @Test
    public void testFactoryDesignPattern(){
        SmartwashTypeFactory smartwashTypeFactory=new SmartwashTypeFactory();
        SmartwashType smartwashType=smartwashTypeFactory.getInstance("Exterior");

        assertNotEquals(smartwashType,null);
    }

    @Test
    public void testSingletonDesignPattern(){
        Smartwash g1=Smartwash.getInstance();
        Smartwash g2=Smartwash.getInstance();

        assertEquals(g1,g2);
    }

}

