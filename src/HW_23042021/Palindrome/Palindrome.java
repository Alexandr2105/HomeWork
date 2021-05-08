package HW_23042021.Palindrome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Palindrome {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\Palindrome\\Palindrome.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\Palindrome\\Palindrome1.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                StringBuilder wordSB = new StringBuilder(s);
                if (s.compareTo(wordSB.reverse().toString()) == 0) {
                    writer.write(s + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
