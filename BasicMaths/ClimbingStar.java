package BasicMaths;

public class ClimbingStar {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1; // Only one way to climb 1 step
        }

        int first = 1; // Represents dp[1]
        int second = 2; // Represents dp[2]

        // Use two variables to keep track of the last two results
        for (int i = 3; i <= n; i++) {
            int current = first + second; // dp[i] = dp[i-1] + dp[i-2]
            first = second; // Update for the next iteration
            second = current;
        }

        return second; // This is dp[n] (the number of ways to reach step n)
    }

    public static void main(String[] args) {
        int n = 5; // Example: You can change n to test with other values
        System.out.println("Number of ways to climb " + n + " steps: " + climbStairs(n));
    }
}
