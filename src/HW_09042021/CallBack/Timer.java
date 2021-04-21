package HW_09042021.CallBack;

public class Timer implements PrintMessage {
    public void timer(int second) throws InterruptedException {
        while (true) {
            Thread.sleep(second * 1000);
            new Swing().font();
        }
    }

    public String printMessage(int sec) {
        return "Прошло " + sec + " секунд!";
    }
}

