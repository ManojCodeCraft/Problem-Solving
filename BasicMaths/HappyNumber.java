package BasicMaths;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    // public static boolean isHappy(int n) {
    // Set<Integer> seen = new HashSet<>();
    // while (n != 1 && !seen.contains(n)) {
    // seen.add(n);
    // n = sumOfSquares(n);
    // }
    // return n == 1;
    // }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquares(n);

        while (fast != 1 && slow != fast) {
            slow = sumOfSquares(slow); // move slow by 1 step
            fast = sumOfSquares(sumOfSquares(fast)); // move fast by 2 steps
        }

        return fast == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 19;
        System.out.println(isHappy(n));
        sc.close();
    }
}
