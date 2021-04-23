package HW_23042021.TextFormater;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] sentences;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\TextFormater\\TextIn.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\TextFormater\\TextOut.txt"));
            String s;
            while ((s = reader.readLine()) != null) {
                sentences = s.split("[.!?]\\s*");
                for (String sentence : sentences) {
                    if (TextFormater.getStringPalindrome(sentence)) {
                        writer.write(sentence + "\n");
                    } else if (TextFormater.getString(sentence) > 2 && TextFormater.getString(sentence) < 6) {
                        writer.write(sentence + "\n");
                    }
                }
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
