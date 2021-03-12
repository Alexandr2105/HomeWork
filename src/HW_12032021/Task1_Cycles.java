package HW_12032021;

public class Task1_Cycles {
    public static void main(String[] args) {
        double distanceday = 10;
        double fulldistance = 10;
        for (int a = 0; a < 6; a++) {
            distanceday = distanceday + (distanceday / 100 * 10);
            fulldistance += distanceday;
        }
        System.out.printf("Суммарный путь который пробежит спортсмен за 7 дней равен %fкм.", fulldistance);
    }
}
