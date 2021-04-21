package HW_09042021.Generics;

public class Generics<T> {
    private T[] list;

    public Generics(T[] list) {
        this.list = list;
    }

    public void getArrays(int a) {
        System.out.println(this.list[a]);
    }
}
