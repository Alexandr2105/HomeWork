package HW_26032021;

public class Freight extends Land {
    private int carryingCapacity;

    public Freight(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption, int carryingCapacity) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public double powerKW() {
        return super.powerKW();
    }

    public void characteristics() {
        System.out.printf("Мощность - %dл.с., Максимальная скорость - %dкм/ч, Масса - %dкг, Марка - %s, Количества колес - %d," +
                        " Расход топлива - %dл/100км, Грузоподьемность - %d т., Мощность - %.1fкВт\n", getPower(), getMaxSpeed(), getWeight(),
                getBrand(), getNumberWheels(), getFuelConsumption(), getCarryingCapacity(), powerKW());
    }

    public void cargo(int a) {
        if (a <= getCarryingCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
