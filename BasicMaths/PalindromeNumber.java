package BasicMaths;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int num = x;
        int rev = 0;
        while (x != 0) {
            int l = x % 10;
            rev = (rev * 10) + l;
            x /= 10;
        }
        return (rev == num);
    }
}
