package HW_02042021;

import HW_02042021.hands.SamsungHand;
import HW_02042021.hands.SonyHand;
import HW_02042021.hands.ToshibaHand;
import HW_02042021.heads.SamsungHead;
import HW_02042021.heads.SonyHead;
import HW_02042021.legs.SamsungLeg;
import HW_02042021.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHand(1100), new SonyHead(1300), new ToshibaLeg(1100));
        Robot robot2 = new Robot(new SonyHand(1000), new SamsungHead(1500), new ToshibaLeg(1100));
        Robot robot3 = new Robot(new ToshibaHand(900), new SonyHead(1300), new SamsungLeg(1300));
        robot1.action();
        robot2.action();
        robot3.action();
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот-robot1");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот-robot2");
        } else if (robot3.getPrice() > robot1.getPrice() && robot3.getPrice() > robot2.getPrice()) {
            System.out.println("Самый дорогой робот-robot3");
        } else {
            System.out.println("Нет самого дорогого");
        }
    }
}
