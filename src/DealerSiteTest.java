import org.junit.Test;

import static org.junit.Assert.*;

public class DealerSiteTest {
    private DealerSite dealerSite = new DealerSite();
    @Test
    public void testGettersAndSetters() {
        Client client = new Client(25, "Adam", "Nowak");
        Employee employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        Purchase purchase = new Purchase(20000.00, car, employee, client);

        dealerSite.addEmployee(employee);
        dealerSite.addVehicle(car, 20000);
        dealerSite.addPurchase(purchase);

        assertTrue(dealerSite.getEmployees().contains(employee));
        assertTrue(dealerSite.getVehicles().containsKey(car));
        assertTrue(dealerSite.getPurchases().contains(purchase));
    }

}