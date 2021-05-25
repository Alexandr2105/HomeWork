package HW_14052021.RegularExpressions;

public class DomainName {
    public static void main(String[] args) {
        String s1 = "http://example.com/";
        String s2 = "example.com";
        boolean result = s1.matches("https?://[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}/?");
        System.out.println((result) ? "true" : "false");
    }
}
