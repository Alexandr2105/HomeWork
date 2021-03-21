package HW_26032021;

public class Civil extends Air {
    private int numberPassengers;
    private boolean businessClass;

    public Civil(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int numberPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    @Override
    public double powerKW() {
        return super.powerKW();
    }

    public void characteristics() {
        String business;
        if (getBusinessClass()) {
            business = "да";
        } else {
            business = "нет";
        }
        System.out.printf("Мощность - %dл.с., Максимальная скорость - %dкм/ч, Масса - %dкг, Марка - %s, Размах крыльев - %dм, " +
                        "Минимальная длина взлетно-посадочной полосы для взлета - %dм, Количество пассажиров - %d, " +
                        "Наличие бизнес-класса - %s, Мощность - %.1fкВт\n", getPower(), getMaxSpeed(), getWeight(), getBrand(), getWingspan(),
                getMinRunwayLength(), getNumberPassengers(), business, powerKW());
    }

    public void maxNumberPassengers(int a) {
        if (a <= numberPassengers) {
            System.out.println("Самолёт может лететь");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
