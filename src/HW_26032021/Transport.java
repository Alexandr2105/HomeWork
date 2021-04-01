package HW_26032021;

public abstract class Transport {
    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public double powerKW() {
        return getPower() * 0.74;
    }

    public abstract void characteristics();
}
