package HW_23042021.TextFormater;

public class TextFormater {
    public static int getWordLength(String sentence) {
        String[] words = sentence.split("[\\p{Punct}\\s*]");
        return words.length;
    }

    public static boolean getStringPalindrome(String sentence) {
        String[] words = sentence.split("[\\p{Punct}\\s*]");
        for (String word : words) {
            if (word.length() > 1) {
                StringBuilder wordSB = new StringBuilder(word);
                if (word.compareTo(wordSB.reverse().toString()) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
