package HW_26032021;

public class Air extends Transport {
    private int wingspan;
    private int minRunwayLength;

    public Air(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }
}
