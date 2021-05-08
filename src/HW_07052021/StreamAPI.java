package HW_07052021;

import java.util.ArrayList;
import java.util.Collections;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> palindrome = new ArrayList<>();
        Collections.addAll(words, "мама", "папа", "дед", "довод", "поп", "топор", "холод");
        words.stream().filter(s -> s.compareTo(new StringBuilder(s).reverse().toString()) == 0).forEach(palindrome::add);
    }
}
