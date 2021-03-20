package HW_19032021;

import java.util.Scanner;

public class Computer {
    private String processorType;
    private int sizeRAM;
    private int hardDiskSize;

    public void printDisplay() {
        System.out.println(processorType);
        System.out.println(sizeRAM);
        System.out.println(hardDiskSize);
    }

    private static int countOn = 0;
    private static int countOff = 0;

    public void turnOnComputer() {
        if (countOn >= 1) {
            System.out.println("Компьютер уже включён и работает");
            System.exit(0);
        }
        System.out.println("Ввести значение 0 либо 1");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = (int) (Math.random() * 2);
        if (a < 0 || a >= 2) {
            System.out.println("Ошибка не верное значение");
        }
        if (a != b) {
            System.out.println("Компьютеру конец");
            System.exit(0);
        } else {
            System.out.println("Компьютер включён и работает");
            countOn++;
        }
    }

    public void turnOffComputer() {
        if (countOff >= 1) {
            System.out.println("Компьютер уже выключен");
            System.exit(0);
        }
        System.out.println("Ввести значение 0 либо 1");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int d = (int) (Math.random() * 2);
        if (c < 0 || c >= 2) {
            System.out.println("Ошибка не верное значение");
        }
        if (c != d) {
            System.out.println("Компьютеру конец");
            System.exit(0);
        } else {
            System.out.println("Компьютер выключен");
            countOff++;
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processorType = "Intel(R) Core(TM) i5-8400";
        computer.hardDiskSize = 1000;
        computer.sizeRAM = 16;
        computer.printDisplay();
        computer.turnOnComputer();
        computer.turnOffComputer();
    }
}
