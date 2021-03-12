package HW_05032021;

import java.util.Arrays;

public class Task5_Arrays {
    public static void main(String[] args) {
        int[] array = {1, 32, 534, 53, 3, 64, 654, 6, 33};
        for (int a = array.length - 1; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                if (array[b] > array[b + 1]) {
                    int c = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

