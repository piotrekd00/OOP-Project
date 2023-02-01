package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");

    @Test
    public void testGettersAndSetters(){
        Assert.assertEquals("Sedan", car.getType());
        Assert.assertEquals('D', car.getCarClass());
        Assert.assertEquals(4, car.getDoors());
        Assert.assertEquals(4, car.getSeats());

        car.setCarClass('H');
        car.setDoors(5);
        car.setSeats(5);
        car.setType("Kombi");

        Assert.assertEquals("Kombi", car.getType());
        Assert.assertEquals('H', car.getCarClass());
        Assert.assertEquals(5, car.getDoors());
        Assert.assertEquals(5, car.getSeats());
    }

    @Test
    public void testToString(){
        String expected = "2010 BMW E92 2.0L Sedan 4 doors 4 seats";
        assertEquals(expected, car.toString());
    }
}