package HW_12032021;

public class Task2_Cycles {
    public static void main(String[] args) {
        int amoeba = 1;
        int b = 0;
        for (int a = 0; a < 24; a += 3) {
            amoeba = amoeba * 2;
            b += 3;
            System.out.printf("Через %d часа, будет %d амеб(ы).\n", b, amoeba);
        }
    }
}
