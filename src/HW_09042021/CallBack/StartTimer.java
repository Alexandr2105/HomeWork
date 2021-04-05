package HW_09042021.CallBack;

public class StartTimer {
    int second = 10;

    public static void main(String[] args) throws InterruptedException {
        new Timer().timer(new StartTimer().second);
    }
}
