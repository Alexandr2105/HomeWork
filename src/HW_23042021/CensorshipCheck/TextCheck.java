package HW_23042021.CensorshipCheck;

import java.util.ArrayList;

public class TextCheck {
    ArrayList<String> array = new ArrayList<>();

    public boolean checkText(ArrayList<String> text, ArrayList<String> blackList) {
        int count = 0;
        for (String string : text) {
            for (String word : blackList) {
                if (string.contains(word)) {
                    count++;
                    array.add(string);
                }
            }
        }
        return count == 0;
    }
}
