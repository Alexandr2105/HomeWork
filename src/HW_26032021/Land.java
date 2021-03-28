package HW_26032021;

public class Land extends Transport {
    protected int numberWheels;
    protected int fuelConsumption;

    public Land(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public void characteristics() {
    }
}
