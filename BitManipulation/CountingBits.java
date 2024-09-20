package BitManipulation;

class CountBits {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        ans[0] = 0;
        for (int i = 0; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
