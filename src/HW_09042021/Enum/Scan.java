package HW_09042021.Enum;

import java.util.Arrays;
import java.util.Scanner;

public class Scan {
    public void readLetterAndPrintItsPosition() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (Arrays.toString(Alphabet.values()).contains(s)) {
            new Position().getLetterPosition(Alphabet.valueOf(s));
        } else {
            System.out.println(s + "-Не верное значение!");
        }
    }
}
