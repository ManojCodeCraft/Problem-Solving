package Hashing;

import java.util.*;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // precompute
        int[] hash = new int[12];
        for (int i = 0; i < n; i++) {
            hash[a[i]] += 1;
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int x = sc.nextInt();
            // fetch
            System.out.println(hash[x]);
        }
        sc.close();
    }
}
