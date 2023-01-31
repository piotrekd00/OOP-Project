import java.util.ArrayList;
import java.util.Date;

public class Employee extends Human{
    private double salary;
    private char performanceClass;
    private Date startDate;
    private ArrayList<Purchase> purchaseList;
    Employee(int age, String name, String secondName, double salary) {
        super(age, name, secondName);
        this.salary = 4000.00;
        this.startDate = new Date();
        this.performanceClass = 'F';
        this.purchaseList = new ArrayList<Purchase>();
    }

    public ArrayList<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public char getPerformanceClass() {
        return performanceClass;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setPerformanceClass(char performanceClass) {
        this.performanceClass = performanceClass;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addPurchaseList(Purchase purchase) {
        this.purchaseList.add(purchase);
    }
}
