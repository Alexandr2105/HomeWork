package HW_05032021;

import java.util.Arrays;
import java.util.Random;

public class Task4_Arrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int negative = 0;
        long multiplication = 1;
        int[] array = new int[rand.nextInt(10)];
        for (int a = 0; a < array.length; a++) {
            array[a] = (rand.nextInt(201) - 100);
        }
        for (int b = 0; b < array.length; b++) {
            if (array[b] < 0) {
                negative += array[b];
            }
        }
        Arrays.sort(array);
        System.out.println("Сумма отрицательных элементов метода равна " + negative);
        for (int c = 0; c < array.length - 2; c++) {
            multiplication = array[c + 1] * multiplication;
        }
        System.out.println("Произведение элементов вектора, расположенных между максимальным и минимальным элементами равно " + multiplication);
    }
}
