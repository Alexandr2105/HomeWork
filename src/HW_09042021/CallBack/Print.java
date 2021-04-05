package HW_09042021.CallBack;

public class Print implements PrintMessage {
    public String printMessage(int sec) {
        return "Прошло " + sec + " секунд!";
    }
}
