package BasicMaths;

class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int l = x % 10;
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + l;
            x /= 10;
        }
        return rev;
    }
}
