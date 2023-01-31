import org.junit.Test;

import static org.junit.Assert.*;

public class PurchaseTest {
    @Test
    public void testGettersAndSetters() {
        Employee employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        Client client = new Client(25, "Adam", "Nowak");
        Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        Purchase purchase = new Purchase(20000.00, car, employee, client);

        assertEquals(car, purchase.getVehicle());
        assertEquals(client, purchase.getBuyer());
        assertEquals(employee, purchase.getSeller());
        assertEquals(20000.00, purchase.getGrossPrice(), 0);
        assertEquals(15400.00, purchase.getNetPrice(), 0);
    }

}