package BitManipulation;

class FlippingBits {
    public static long flippingBits(long n) {
        long one = (long) Math.pow(2, 32) - 1;
        return (n ^ one);
    }
}
