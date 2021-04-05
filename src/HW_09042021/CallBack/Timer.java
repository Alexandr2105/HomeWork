package HW_09042021.CallBack;

public class Timer {
    public void timer(int second) throws InterruptedException {
        while (true) {
            Thread.sleep(second * 1000);
            new Swing().font();
        }
    }
}

