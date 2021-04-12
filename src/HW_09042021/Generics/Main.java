package HW_09042021.Generics;


public class Main {
    public static void main(String[] args) {
        new Generics<>(new Integer[]{1, 34, 53, 53}).getArrays(3);
        new Generics<>(new String[]{"1234", "3432", "43434"}).getArrays(2);
        new Generics<>(new Double[]{1.5, 3.5, 5.2, 1.2}).getArrays(1);

    }
}
