package classes;
import java.util.*;

public class DealerSite implements Stats{
    private HashMap<Vehicle, Double> vehicles;
    private HashSet<Purchase> purchases;
    private ArrayList<Employee> employees;

    public DealerSite(){
        this.vehicles = new HashMap<>();
        this.purchases = new HashSet<>();
        this.employees = new ArrayList<>();
    }

    public DealerSite(HashMap<Vehicle, Double> vehicles, HashSet<Purchase> purchases, ArrayList<Employee> employees){
        this.vehicles = vehicles;
        this.purchases =purchases;
        this.employees = employees;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public HashMap<Vehicle, Double> getVehicles() {
        return vehicles;
    }

    public HashSet<Purchase> getPurchases() {
        return purchases;
    }
    public void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addVehicle(Vehicle vehicle, double price) throws IllegalArgumentException {
        if (price <= 0) throw new IllegalArgumentException();
        this.vehicles.put(vehicle, price);
    }

    public void changeVehiclePrice(Vehicle vehicle, double newPrice){
        if (newPrice <= 0) throw new IllegalArgumentException();
        for (Map.Entry<Vehicle, Double> v : this.vehicles.entrySet()){
            if (v.getKey() == vehicle){
                v.setValue(newPrice);
                return;
            }
        }
        System.out.println("Vehicle was not found");
    }
    public ArrayList<Purchase> getPurchasesInTimeRange(Date startDate, Date endDate) {
        ArrayList<Purchase> purchasesInTimeRange = new ArrayList<>();
        for (Purchase purchase : this.purchases) {
            if (purchase.getDate().after(startDate) && purchase.getDate().before(endDate)) {
                purchasesInTimeRange.add(purchase);
            }
        }
        return purchasesInTimeRange;
    }

    public double getVehiclePrice(Vehicle vehicle){
        for (Map.Entry<Vehicle, Double> v : this.vehicles.entrySet()){
            if (v.getKey() == vehicle){
                return v.getValue();
            }
        }
        System.out.println("Vehicle was not found");
        return 0;
    }

    public ArrayList<Vehicle> getVehiclesBetweenPriceRange(double minPrice, double maxPrice){
        ArrayList<Vehicle> vehiclesBetweenPriceRange = new ArrayList<>();
        for (Map.Entry<Vehicle, Double> vehicle : this.vehicles.entrySet()) {
            if (vehicle.getValue() >= minPrice && vehicle.getValue() <= maxPrice) {
                vehiclesBetweenPriceRange.add(vehicle.getKey());
            }
        }
        return vehiclesBetweenPriceRange;
    }

    public int getVehicleCount(String type) {
        int count = 0;
        for (Vehicle vehicle : this.vehicles.keySet()) {
            if (type.equalsIgnoreCase("motorcycle") && vehicle instanceof Motorcycle) {
                count++;
            } else if (type.equalsIgnoreCase("car") && vehicle instanceof Car) {
                count++;
            }
        }
        return count;
    }

    public double getSumOfPurchases() {
        double sum = 0.0;
        for (Purchase purchase : this.purchases) {
            sum += purchase.getNetPrice();
        }
        return sum;
    }

    public Employee getEmployeeWithHighestSales() {
        double maxSales = 0.0;
        Employee employeeWithMaxSales = null;
        for (Employee employee : this.employees) {
            double employeeSales = employee.calculateSales();
            if (employeeSales > maxSales) {
                maxSales = employeeSales;
                employeeWithMaxSales = employee;
            }
        }
        return employeeWithMaxSales;
    }

    public Client getClientWithHighestPurchases() {
        double maxBuys = 0.0;
        Client clientWithMaxBuys = null;
        for (Purchase purchase : this.purchases) {
            Client client = purchase.getBuyer();
            double clientBuys = client.calculatePurchases();
            if (clientBuys > maxBuys) {
                maxBuys = clientBuys;
                clientWithMaxBuys = client;
            }
        }
        return clientWithMaxBuys;
    }

    public Purchase getBestPurchase() {
        Purchase bestPurchase = null;
        for (Purchase purchase : this.purchases) {
            if (bestPurchase == null || purchase.compareTo(bestPurchase) > 0) {
                bestPurchase = purchase;
            }
        }
        return bestPurchase;
    }

}
