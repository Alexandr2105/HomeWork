package HW_12032021;

public class Task3_Cycles {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a < 99; a++) {
            if (a % 2 != 0) {
                sum += a;
            }
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99 равна " + sum);
    }
}
