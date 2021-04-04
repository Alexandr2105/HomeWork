package HW_02042021.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Sony поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
