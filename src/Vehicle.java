public abstract class Vehicle {
    private int productionYear;
    private String brand;
    private String model;
    private double engineCapacity;
    private boolean available;

    Vehicle(int productionYear, String brand, String model, double engineCapacity){
        this.productionYear = productionYear;
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public final int getProductionYear() {
        return productionYear;
    }

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public final double getEngineCapacity() {
        return engineCapacity;
    }

    public final boolean isAvailable() {
        return available;
    }

    public final void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final void setModel(String model) {
        this.model = model;
    }

    public final void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public final void setAvailable(boolean available) {
        this.available = available;
    }
}
