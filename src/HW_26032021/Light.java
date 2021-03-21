package HW_26032021;

import java.util.Scanner;

public class Light extends Land {
    private String bodyType;
    private int numberPassengers;
    private double time;

    public Light(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption,
                 String bodyType, int numberPassengers, double time) { //Не понял как по другому вводить время, поэтому засунул его в конструктор
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
        this.time = time;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    @Override
    public double powerKW() {
        return super.powerKW();
    }

    public void characteristics() {
        System.out.printf("Мощность - %dл.с., Максимальная скорость - %dкм/ч, Масса - %dкг, Марка - %s, Количества колес - %d," +
                        " Расход топлива - %dл/100км, Тип кузова - %s, Количества пассажиров - %d, Мощность - %.1fкВт\n", getPower(),
                getMaxSpeed(), getWeight(), getBrand(), getNumberWheels(), getFuelConsumption(), getBodyType(), getNumberPassengers(), powerKW());
    }

    private double fuel() {
        return (getFuelConsumption() / 100.0) * distance();
    }

    public double distance() {
        return getMaxSpeed() * time;
    }

    public void printDistance() {
        System.out.printf("За время %.1f часа, автомобиль %s, двигаясь с максимальной скоростью %d км/ч, проедет %.1f км и израсходует %.1f литров топлива.\n",
                time, getBrand(), getMaxSpeed(), distance(), fuel());
    }
}
