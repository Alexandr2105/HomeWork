package HW_23042021.TextFormater;

public class TextFormater {
    public static int getString(String sentence) {
        String[] words = sentence.split("[\\p{Punct}\\s*]");
        return words.length;
    }

    public static boolean getStringPalindrome(String sentence) {
        int count;
        String[] words = sentence.split("[\\p{Punct}\\s*]");
        for (String word : words) {
            count = 0;
            if (word.length() > 1) {
                char[] chars = word.toCharArray();
                for (char aChars : chars) {
                    if (aChars != chars[(chars.length - count) - 1]) {
                        break;
                    } else count++;
                }
                if (count == word.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
