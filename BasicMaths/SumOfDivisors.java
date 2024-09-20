package BasicMaths;

public class SumOfDivisors {
    // brute force approach
    static long sumOfDivisors(int N) {
        long res = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sum += j;
                    if (i / j != j)
                        sum += i / j;
                }
            }
            res += sum;
        }
        return res;
    }
    // Optimal solution
    // static long sumOfDivisors(int N) {
    // long res = 0;

    // // For each number i from 1 to N
    // for (int i = 1; i <= N; i++) {
    // // i is a divisor for all its multiples j
    // for (int j = i; j <= N; j += i) {
    // res += i; // Add i as a divisor to its multiple j
    // }
    // }

    // return res;
    // }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(sumOfDivisors(n));
    }
}
