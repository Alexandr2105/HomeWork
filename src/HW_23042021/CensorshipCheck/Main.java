package HW_23042021.CensorshipCheck;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sentences = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        TextCheck textCheck = new TextCheck();
        try {
            BufferedReader origin = new BufferedReader(new FileReader("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\CensorshipCheck\\OriginalText.txt"));
            BufferedReader blackList = new BufferedReader(new FileReader("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\CensorshipCheck\\BlackList.txt"));
            String s;
            while ((s = origin.readLine()) != null) {
                String[] sentence = s.split("[!?.]\\s*");
                sentences.addAll(Arrays.asList(sentence));
            }
            while ((s = blackList.readLine()) != null) {
                String[] word = s.split("[\\p{Punct}]\\s*");
                words.addAll(Arrays.asList(word));
            }
            if (!textCheck.checkText(sentences, words)) {
                System.out.printf("Текст не прошёл проверку на цензуру! %d предложения\n", textCheck.array.size());
                for (String string : textCheck.array) {
                    System.out.println(string);
                }
            } else {
                System.out.println("Текст прошёл проверку на цензуру");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
