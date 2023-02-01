package classes;

public class Motorcycle extends Vehicle{
    private boolean hasGlass;
    private int trunkCapacity;
    public Motorcycle(int productionYear, String brand, String model, double engineCapacity, boolean hasGlass, int trunkCapacity) {
        super(productionYear, brand, model, engineCapacity);
        this.hasGlass = hasGlass;
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public boolean isHasGlass() {
        return hasGlass;
    }

    public void setHasGlass(boolean hasGlass) {
        this.hasGlass = hasGlass;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
