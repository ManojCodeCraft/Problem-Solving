package BasicMaths;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println(sum(n));
        sc.close();
    }

    public static int sum(int n) {
        if (n <= 9)
            return n;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum(sum);
    }
}
