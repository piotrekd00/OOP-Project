import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class DealerSite {
    private HashMap<Vehicle, Double> vehicles;
    private HashSet<Purchase> purchases;
    private ArrayList<Employee> employees;

    DealerSite(){
        this.vehicles = new HashMap<Vehicle, Double>();
        this.purchases = new HashSet<Purchase>();
        this.employees = new ArrayList<Employee>();
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
    public void addVehicle(Vehicle vehicle, double price) {
        this.vehicles.put(vehicle, price);
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
}
