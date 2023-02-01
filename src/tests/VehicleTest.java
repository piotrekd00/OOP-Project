package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle vehicle = new Vehicle(2010, "BMW", "E92", 2.0){};

    @Test
    public void testGettersAndSetters() {
        Assert.assertEquals(2.0, vehicle.getEngineCapacity(), 0);
        Assert.assertEquals(2010, vehicle.getProductionYear());
        Assert.assertEquals("BMW", vehicle.getBrand());
        Assert.assertEquals("E92", vehicle.getModel());
        assertTrue(vehicle.isAvailable());

        vehicle.setAvailable(false);
        vehicle.setBrandAndModel("Mercedes", "CLS");
        vehicle.setProductionYear(2009);
        vehicle.setEngineCapacity(2.4);

        Assert.assertEquals(2.4, vehicle.getEngineCapacity(), 0);
        Assert.assertEquals(2009, vehicle.getProductionYear());
        Assert.assertEquals("Mercedes", vehicle.getBrand());
        Assert.assertEquals("CLS", vehicle.getModel());
        assertFalse(vehicle.isAvailable());
    }
    @Test
    public void testAvailability(){
        Employee employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        Client client = new Client(25, "Adam", "Nowak");
        Purchase purchase = new Purchase(20000.00, vehicle, employee, client);

        assertFalse(vehicle.isAvailable());
    }
}