package HW_26032021;

public class Light extends Land {
    private String bodyType;
    private int numberPassengers;

    public Light(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption,
                 String bodyType, int numberPassengers) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    @Override
    public void characteristics() {
        System.out.printf("Мощность - %dл.с., Максимальная скорость - %dкм/ч, Масса - %dкг, Марка - %s, Количества колес - %d," +
                        " Расход топлива - %dл/100км, Тип кузова - %s, Количества пассажиров - %d, Мощность - %.1fкВт\n", getPower(),
                getMaxSpeed(), getWeight(), getBrand(), getNumberWheels(), getFuelConsumption(), getBodyType(), getNumberPassengers(), powerKW());
    }

    private double fuel(double time) {
        return (getFuelConsumption() / 100.0) * distance(time);
    }

    public double distance(double time) {
        return getMaxSpeed() * time;
    }

    public void printDistance(double time) {
        System.out.printf("За время %.1f часа, автомобиль %s, двигаясь с максимальной скоростью %d км/ч, проедет %.1f км и израсходует %.1f литров топлива.\n",
                time, getBrand(), getMaxSpeed(), distance(time), fuel(time));
    }
}
