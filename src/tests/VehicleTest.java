package tests;
import classes.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle vehicle;
    private Employee employee;
    private Client client;
    private Purchase purchase;
    @Before
    public void setUp(){
        vehicle = new Vehicle(2010, "BMW", "E92", 2.0){};
        employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        client = new Client(25, "Adam", "Nowak");
        purchase = new Purchase(20000.00, vehicle, employee, client);
    }
    @Test
    public void testGettersAndSetters() {
        Assert.assertEquals(2.0, vehicle.getEngineCapacity(), 0);
        Assert.assertEquals(2010, vehicle.getProductionYear());
        Assert.assertEquals("BMW", vehicle.getBrand());
        Assert.assertEquals("E92", vehicle.getModel());

        vehicle.setAvailable(true);
        vehicle.setBrandAndModel("Mercedes", "CLS");
        vehicle.setProductionYear(2009);
        vehicle.setEngineCapacity(2.4);

        Assert.assertEquals(2.4, vehicle.getEngineCapacity(), 0);
        Assert.assertEquals(2009, vehicle.getProductionYear());
        Assert.assertEquals("Mercedes", vehicle.getBrand());
        Assert.assertEquals("CLS", vehicle.getModel());
        assertTrue(vehicle.isAvailable());
    }
    @Test
    public void testAvailability(){
        assertFalse(vehicle.isAvailable());
    }

    @Test
    public void testToString(){
        String expected = "2010 BMW E92 2.0";
        assertEquals(expected, vehicle.toString());
    }
    @After
    public void tearDown(){
        vehicle = null;
        employee = null;
        client = null;
        purchase = null;
        assertNull(vehicle);
        assertNull(employee);
        assertNull(client);
        assertNull(purchase);
    }
}