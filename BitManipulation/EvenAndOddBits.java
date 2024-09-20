package BitManipulation;

class EvenOddBits {
    public int[] evenOddBit(int n) {
        int[] A = new int[2];
        String binary = Integer.toBinaryString(n);
        for (int i = binary.length() - 1, k = 0; i >= 0; i--) {
            if (i % 2 == 0)
                A[0] += binary.charAt(k++) - '0';
            else
                A[1] += binary.charAt(k++) - '0';
        }
        return A;
    }
}