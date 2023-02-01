package classes;
import java.util.ArrayList;

public interface Stats {
    public ArrayList<Vehicle> getVehiclesBetweenPriceRange(double minPrice, double maxPrice);
    public int getVehicleCount(String type);
    public double getSumOfPurchases();
    public Employee getEmployeeWithHighestSales();
    public Purchase getBestPurchase();
}

