package BitManipulation;

class SumAndXOR {
    public static long sumXor(long n) {
        long count = 1;
        while (n > 0) {
            if (n % 2 == 0)
                count *= 2;
            n = n >> 1;
        }
        return count;
    }
}