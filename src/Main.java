import classes.*;

public class Main {
    public static void main(String[] args) {
        DealerSite dealerSite = new DealerSite();
        Client client = new Client(25, "Adam", "Nowak");
        Employee employee = new Employee(23, "Piotr", "Dudkiewicz", 5000.00);
        Car car = new Car(2010, "BMW", "E92", 2.0, 'D', 4, 4, "Sedan");
        Purchase purchase = new Purchase(20000.00, car, employee, client);
        dealerSite.addPurchase(purchase);
        dealerSite.addEmployee(employee);
        PerformanceChecker perf = new PerformanceChecker(dealerSite);
        perf.run();
        System.out.println(employee.getPerformanceClass());
    }

}