package HW_05032021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_Pifagor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Integer.parseInt(reader.readLine());
        double b = Integer.parseInt(reader.readLine());
        double r = Integer.parseInt(reader.readLine());
        if (r >= (Math.sqrt(a * a + b * b)) / 2) {
            System.out.println("Прямоугольное отверстие размерами а=" + a + " и b=" + b + " можно полностью закрыть круглой картонкой радусом r=" + r);
        } else {
            System.out.println("Прямоугольное отверстие размероми a=" + a + " и b=" + b + " нельзя полностью закрыть круглой картонкой радиусом r=" + r);
        }
    }
}
