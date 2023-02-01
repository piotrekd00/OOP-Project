package classes;

public class Car extends Vehicle{
    private char carClass;
    private String type;
    private int doors;
    private int seats;

    public Car(int productionYear, String brand, String model, double engineCapacity, char carClass, int doors, int seats, String type) {
        super(productionYear, brand, model, engineCapacity);
        this.type = type;
        this.carClass = carClass;
        this.doors = doors;
        this.seats = seats;
    }

    public char getCarClass() {
        return carClass;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
