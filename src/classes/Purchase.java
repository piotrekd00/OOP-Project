package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase implements Comparable<Purchase> {
    private final Date date;
    private final double grossPrice;
    private final Vehicle vehicle;
    private final Employee seller;
    private final Client buyer;

    public Purchase(double grossPrice, Vehicle vehicle, Employee employee, Client client){
        this.date = new Date();
        vehicle.setAvailable(false);
        employee.addPurchaseList(this);
        client.addPurchaseList(this);
        this.grossPrice = grossPrice;
        this.vehicle = vehicle;
        this.seller = employee;
        this.buyer = client;
    }

    public Client getBuyer() {
        return buyer;
    }

    public Date getDate() {
        return date;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    public Employee getSeller() {
        return seller;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public double getNetPrice() {
        return grossPrice * 0.77;
    }
    public String humanReadableDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(this.date);
    }

    @Override
    public int compareTo(Purchase other) {
        int result = Double.compare(this.getNetPrice(), other.getNetPrice());
        if (result == 0) {
            result = this.date.compareTo(other.date);
        }
        return result;
    }
}
