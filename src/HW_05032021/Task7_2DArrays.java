package HW_05032021;

import java.util.Random;

public class Task7_2DArrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[rand.nextInt(100)][];
        for (int a = 0; a < array.length; a++) {
            array[a] = new int[rand.nextInt(100)];
        }
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b]= rand.nextInt(100);
                System.out.print(array[a][b]);
            }
            System.out.println();
        }
    }
}
