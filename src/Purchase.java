import java.util.Date;

public class Purchase {
    private final Date date;
    private final double grossPrice;
    private final Vehicle vehicle;
    private final Employee seller;
    private final Client buyer;

    Purchase(double grossPrice, Vehicle vehicle, Employee employee, Client client){
        this.date = new Date();
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
}
