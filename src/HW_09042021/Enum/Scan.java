package HW_09042021.Enum;

import java.util.Arrays;
import java.util.Scanner;

public class Scan {
    public void printABC() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (Arrays.toString(ABC.values()).contains(s)) {
            new Position().getLetterPosition(ABC.valueOf(s));
        } else {
            System.out.println(s + "-Не верное значение!");
        }
    }
}
