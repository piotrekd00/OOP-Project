package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);

    @Test
    public void testGettersAndSetters() {
        Assert.assertEquals(5000.00, employee.getSalary(), 0);
        Assert.assertEquals('F', employee.getPerformanceClass());
        assertNotNull(employee.getStartDate());
        assertTrue(employee.getPurchaseList().isEmpty());

        employee.setPerformanceClass('A');
        employee.setSalary(6000.00);

        Assert.assertEquals('A', employee.getPerformanceClass());
        Assert.assertEquals(6000.00, employee.getSalary(), 0.001);
    }

    @Test
    public void testSelling(){
        Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        Client client = new Client(25, "Adam", "Nowak");
        Purchase purchase = new Purchase(20000.00, car, employee, client);
        assertTrue(employee.getPurchaseList().contains(purchase));
    }

}
