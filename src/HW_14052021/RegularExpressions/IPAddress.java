package HW_14052021.RegularExpressions;

public class IPAddress {
    public static void main(String[] args) {
        String ip1 = "127.0.0.1";
        String ip2 = "255.255.255.0";
        String ip3 = "1300.6.7.8";
        String ip4 = "abc.def.gha.bcd";
        boolean result = ip1.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
