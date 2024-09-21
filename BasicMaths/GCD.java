package BasicMaths;

import java.util.*;;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD(a, b);
        sc.close();
    }

    // Brute Force Approach
    // public static void GCD(int a, int b) {
    // for (int i = Math.min(a, b); i >= 1; i--) {
    // if (a % i == 0 && b % i == 0) {
    // System.out.println(i + " ");
    // break;
    // }
    // }
    // }
    // Optimal Solution
    public static void GCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
