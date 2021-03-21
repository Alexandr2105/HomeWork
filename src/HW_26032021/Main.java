package HW_26032021;

public class Main {
    public static void main(String[] args) {
        Light light = new Light(355, 250, 1745, "Audy", 4, 9, "Седан", 5, 4.5);
        Freight freight = new Freight(330, 85, 4150, "МАЗ", 6, 27, 20);
        Civil civil = new Civil(250000, 817, 26581, "Boeing 737", 29, 2473, 133, true);
        Military military = new Military(284, 3000, 18500, "Су-57", 14, 300, true, 4);
        light.characteristics();
        light.printDistance();
        freight.characteristics();
        freight.cargo(21);
        civil.characteristics();
        civil.maxNumberPassengers(130);
        military.characteristics();
        military.shot(2);
        military.ejection();
    }
}
