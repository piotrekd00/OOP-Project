package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorcycleTest {
    private Motorcycle motorcycle = new Motorcycle(2010, "BMW", "R1200GS", 125, true, 0);

    @Test
    public void testGettersAndSetters(){
        Assert.assertEquals(0, motorcycle.getTrunkCapacity());
        assertTrue(motorcycle.isHasGlass());

        motorcycle.setHasGlass(false);
        motorcycle.setTrunkCapacity(5);

        Assert.assertEquals(5, motorcycle.getTrunkCapacity());
        assertFalse(motorcycle.isHasGlass());
    }

    @Test
    public void testToString(){
        String expected = "2010 BMW R1200GS 125.0cc";
        assertEquals(expected, motorcycle.toString());
        motorcycle.setTrunkCapacity(10);
        expected = "2010 BMW R1200GS 125.0cc with 10L trunk";
        assertEquals(expected, motorcycle.toString());
    }
}