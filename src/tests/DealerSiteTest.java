package tests;
import classes.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class DealerSiteTest {
    private DealerSite dealerSite;
    private Client client;
    private Employee employee;
    private Purchase purchase;
    private Car car;
    private Motorcycle motorcycle;

    @Before
    public void setUp(){
        dealerSite = new DealerSite();
        client = new Client(25, "Adam", "Nowak");
        employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        motorcycle = new Motorcycle(2010, "BMW", "R1200GS", 125, true, 0);
        purchase = new Purchase(20000.00, car, employee, client);
    }
    @Test
    public void testGettersAndSetters() {
        dealerSite.addEmployee(employee);
        dealerSite.addVehicle(car, 20000);
        dealerSite.addPurchase(purchase);

        assertTrue(dealerSite.getEmployees().contains(employee));
        assertTrue(dealerSite.getVehicles().containsKey(car));
        assertTrue(dealerSite.getPurchases().contains(purchase));
    }

    @Test
    public void testOverload(){
        HashMap<Vehicle, Double> vehicles = new HashMap<Vehicle, Double>();
        HashSet<Purchase> purchases = new HashSet<Purchase>();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        vehicles.put(car, 5000.00);
        purchases.add(purchase);
        employees.add(employee);

        dealerSite = new DealerSite(vehicles, purchases, employees);

        assertTrue(dealerSite.getEmployees().contains(employee));
        assertTrue(dealerSite.getVehicles().containsKey(car));
        assertTrue(dealerSite.getPurchases().contains(purchase));
    }
    @Test
    public void testPurchasesInTimeRange() {
        Date date = new Date();
        Date date1 = new Date(date.getTime() - TimeUnit.DAYS.toMillis( 1 ));
        Date date2 = new Date(date.getTime() + TimeUnit.DAYS.toMillis( 1 ));
        dealerSite.addPurchase(purchase);
        assertTrue(dealerSite.getPurchasesInTimeRange(date1, date2).contains(purchase));
    }

    @Test
    public void testVehicleInPriceRange() {
        dealerSite.addVehicle(car, 5000);
        dealerSite.addVehicle(motorcycle, 7000);
        assertTrue(dealerSite.getVehiclesBetweenPriceRange(4000, 6000).contains(car));
        assertFalse(dealerSite.getVehiclesBetweenPriceRange(4000, 6000).contains(motorcycle));
    }

    @Test
    public void testVehicleCount() {
        dealerSite.addVehicle(car, 5000);
        dealerSite.addVehicle(motorcycle, 7000);
        assertEquals(dealerSite.getVehicleCount("car"), 1);
        assertEquals(dealerSite.getVehicleCount("motorcycle"), 1);
    }

    @Test
    public void testGetSumOfPurchases(){
        dealerSite.addPurchase(purchase);
        Purchase purchaseB = new Purchase(15000.00, motorcycle, employee, client);
        dealerSite.addPurchase(purchaseB);
        assertEquals(26950.0, dealerSite.getSumOfPurchases(), 0);
    }

    @Test
    public void testGetEmployeeWithHighestSales(){
        dealerSite.addPurchase(purchase);
        Purchase purchaseB = new Purchase(15000.00, motorcycle, employee, client);
        dealerSite.addPurchase(purchaseB);
        Employee employeeB = new Employee(23, "Piotr", "Nowak", 5000.00);
        Purchase purchaseC = new Purchase(15000.00, motorcycle, employeeB, client);
        dealerSite.addPurchase(purchaseC);
        dealerSite.addEmployee(employee);
        dealerSite.addEmployee(employeeB);
        assertEquals(employee, dealerSite.getEmployeeWithHighestSales());
    }

    @Test
    public void testGetBestPurchase(){
        Purchase purchaseB = new Purchase(15000.00, motorcycle, employee, client);
        dealerSite.addPurchase(purchase);
        dealerSite.addPurchase(purchaseB);
        assertEquals(purchase, dealerSite.getBestPurchase());
    }

    @After
    public void tearDown() throws Exception{
        dealerSite = null;
        client = null;
        employee = null;
        car = null;
        purchase = null;
        assertNull(dealerSite);
        assertNull(client);
        assertNull(employee);
        assertNull(car);
        assertNull(purchase);
    }
}