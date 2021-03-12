package HW_12032021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_Recursion {
    static int n;
    static int x;
    static int count = 0;

    public static int primes(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        if (primes(n - 1) == x)//не придумал инчего лучше, но работает)))
            return 0;
            if (x % n == 0) {
                count++;
            }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        x = n;
        if (primes(n) == 1) {
            System.out.printf("Is number %d simple - YES\n", n);
        } else System.out.printf("Is number %d simple - NO\n", n);
    }
}

