package BasicMaths;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = (int) Math.log10(n) + 1;
        // while (n > 0) {
        // c++;
        // n /= 10;
        // }
        System.out.println(c);
    }
}
