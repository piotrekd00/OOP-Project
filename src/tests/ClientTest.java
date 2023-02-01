package tests;
import classes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    private Client client = new Client(25, "Adam", "Nowak");

    @Test
    public void testBuying() {
        Employee employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        Purchase purchase = new Purchase(20000.00, car, employee, client);
        assertTrue(client.getPurchaseList().contains(purchase));
    }
}