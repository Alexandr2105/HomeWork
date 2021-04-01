package HW_02042021.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
