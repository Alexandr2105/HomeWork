package HW_05032021;

import java.util.Random;
import java.util.Scanner;

public class Task6_2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rand = new Random();
        int[][] array = new int[n][n];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                array[a][b] = rand.nextInt(100);
            }
        }
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                if (array[a][b] % 2 == 0) {
                    array[a][b] = 0;
                } else {
                    array[a][b] = 1;
                }
                System.out.print(array[a][b]);
            }
            System.out.println();
        }
    }
}
