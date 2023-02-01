package tests;
import classes.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
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
    public void testGettersAndSetters() {
        Assert.assertEquals(5000.00, employee.getSalary(), 0);
        Assert.assertEquals('F', employee.getPerformanceClass());
        assertNotNull(employee.getStartDate());

        employee.setPerformanceClass('A');
        employee.setSalary(6000.00);

        Assert.assertEquals('A', employee.getPerformanceClass());
        Assert.assertEquals(6000.00, employee.getSalary(), 0.001);
    }

    @Test
    public void testSelling(){
        assertTrue(employee.getPurchaseList().contains(purchase));
    }

    @Test
    public void testCalculateSales(){
        Purchase purchaseB = new Purchase(15000.00, motorcycle, employee, client);
        assertEquals(26950.0, employee.calculateSales(),0);
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
