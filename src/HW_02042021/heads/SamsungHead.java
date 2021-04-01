package HW_02042021.heads;

import HW_02042021.hands.SamsungHand;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Горорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
