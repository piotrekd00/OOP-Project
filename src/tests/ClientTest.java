package tests;
import classes.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    private Client client;
    private Employee employee;
    private Purchase purchase;
    private Car car;
    private Motorcycle motorcycle;

    @Before
    public void setUp(){
        employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        client = new Client(25, "Adam", "Nowak");
        car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        motorcycle = new Motorcycle(2010, "BMW", "R1200GS", 125, true, 0);
        purchase = new Purchase(20000.00, car, employee, client);
    }
    @Test
    public void testBuying() {
        assertTrue(client.getPurchaseList().contains(purchase));
    }

    @Test
    public void testCalculatingPurchases(){
        Purchase purchaseB = new Purchase(15000.00, motorcycle, employee, client);
        assertEquals(35000.0, client.calculatePurchases(),0);
    }

    @After
    public void tearDown(){
        client = null;
        motorcycle = null;
        employee = null;
        car = null;
        purchase = null;
        assertNull(motorcycle);
        assertNull(client);
        assertNull(employee);
        assertNull(car);
        assertNull(purchase);
    }
}