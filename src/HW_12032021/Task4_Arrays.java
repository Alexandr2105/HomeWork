package HW_12032021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task4_Arrays {
    public static void main(String[] args) throws IOException {
        System.out.println("Для остановки ввода нажмите 0.");
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayEven = new ArrayList<>();
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) {
                break;
            }
            if (n <= 3) {
                System.out.printf("Ошибка. Число %d меньше 4\n", n);
            }
            array.add(n);
        }
        for (Integer a : array) {
            if (a % 2 == 0) {
                arrayEven.add(a);
            }
        }
        for (int b : arrayEven) {
            System.out.println(b);
        }
    }
}
