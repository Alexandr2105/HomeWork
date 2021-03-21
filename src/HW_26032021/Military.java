package HW_26032021;

public class Military extends Air {
    private boolean ejectionSystem;
    private int numberMissiles;

    public Military(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, boolean ejectionSystem, int numberMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberMissiles = numberMissiles;
    }

    public boolean getEjectionSystem() {
        return ejectionSystem;
    }

    public int getNumberMissiles() {
        return numberMissiles;
    }

    @Override
    public double powerKW() {
        return super.powerKW();
    }

    public void characteristics() {
        String eject;
        if (getEjectionSystem()) {
            eject = "есть";
        } else {
            eject = "нет";
        }
        System.out.printf("Мощность - %dл.с., Максимальная скорость - %dкм/ч, Масса - %dкг, Марка - %s, Размах крыльев - %dм., " +
                        "Минимальная длина взлетно-посадочной полосы для взлета - %dм, Наличие системы катапультирования - %s, " +
                        "Количество ракет на борту - %d, Мощность - %.1fкВт\n", getPower(), getMaxSpeed(), getWeight(), getBrand(), getWingspan(),
                getMinRunwayLength(), eject, getNumberMissiles(), powerKW());
    }

    public void shot(int a) {
        if (a > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
