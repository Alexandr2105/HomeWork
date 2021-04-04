package HW_02042021;

import HW_02042021.hands.IHand;
import HW_02042021.heads.IHead;
import HW_02042021.legs.ILeg;

public class Robot implements IRobot {
    private IHand hand;
    private IHead head;
    private ILeg leg;

    public Robot(IHand hand, IHead head, ILeg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Robot() {
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = hand.getPrice() + head.getPrice() + leg.getPrice();
        return price;
    }
}
