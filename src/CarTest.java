import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");

    @Test
    public void testGettersAndSetters(){
        assertEquals("Sedan", car.getType());
        assertEquals('D', car.getCarClass());
        assertEquals(4, car.getDoors());
        assertEquals(4, car.getSeats());

        car.setCarClass('H');
        car.setDoors(5);
        car.setSeats(5);
        car.setType("Kombi");

        assertEquals("Kombi", car.getType());
        assertEquals('H', car.getCarClass());
        assertEquals(5, car.getDoors());
        assertEquals(5, car.getSeats());
    }

}