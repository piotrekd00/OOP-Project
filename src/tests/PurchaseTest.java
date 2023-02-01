package tests;
import classes.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PurchaseTest {
    private Client client;
    private Employee employee;
    private Purchase purchase;
    private Car car;

    @Before
    public void setUp(){
        employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        client = new Client(25, "Adam", "Nowak");
        car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        purchase = new Purchase(20000.00, car, employee, client);
    }
    @Test
    public void testGettersAndSetters() {
        assertEquals(car, purchase.getVehicle());
        assertEquals(client, purchase.getBuyer());
        assertEquals(employee, purchase.getSeller());
        assertEquals(20000.00, purchase.getGrossPrice(), 0);
    }

    @Test
    public void testGetNetPrice(){
        assertEquals(15400.00, purchase.getNetPrice(),0);
    }
    @After
    public void tearDown(){
        client = null;
        employee = null;
        car = null;
        purchase = null;
        assertNull(client);
        assertNull(employee);
        assertNull(car);
        assertNull(purchase);
    }
}