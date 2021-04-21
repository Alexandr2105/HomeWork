package HW_09042021.CallBack;

public class StartTimer {
    static int second = 10;

    public static void main(String[] args) throws InterruptedException {
        new Timer().timer(second);
    }
}
