package BitManipulation;

class MaximizingXor {
    public static int maximizingXor(int l, int r) {
        int maxXor = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                int xor = i ^ j;
                if (xor > maxXor) {
                    maxXor = xor;
                }
            }
        }
        return maxXor;
    }
}