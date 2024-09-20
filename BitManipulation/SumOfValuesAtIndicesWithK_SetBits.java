package BitManipulation;

import java.util.*;

class SumIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = numOfSetBits(i);
            if (count == k) {
                res += nums.get(i);
            }
        }
        return res;
    }

    public static int numOfSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }
}