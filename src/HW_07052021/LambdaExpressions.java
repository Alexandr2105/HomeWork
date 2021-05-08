package HW_07052021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressions {
    public static void main(String[] args) {
        String[] st1 = {"Мама мыла раму"};
        String[] st2 = {"Мама мыла раму", "Мама мыла раму мылом"};
        String[] st3 = {"Мама мыла раму", "Мыла раму мама мылом", "Мама мыла Лару"};
        ArrayList<String[]> arrays = new ArrayList<>();
        Collections.addAll(arrays,st1,st2,st3);
        arrays.sort(Comparator.comparingInt(x -> x.length));
        arrays.forEach(s -> System.out.println(Arrays.toString(s)));

        Comparator<String[]> comparator = (Comparator.comparingInt(x -> x.length));
        arrays.sort(comparator.reversed());
        arrays.forEach(s -> System.out.println(Arrays.toString(s)));
    }
}
