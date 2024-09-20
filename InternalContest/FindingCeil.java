package InternalContest;

import java.util.Scanner;

public class FindingCeil {
    public static long ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        ms(a, n, 0, n - 1);
        int nq = sc.nextInt();
        for (int i = 0; i < nq; i++) {
            int q = sc.nextInt();
            System.out.println(ceil(a, n, q));
        }
        sc.close();
    }

    static void ms(long[] a, int n, int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = (l + h) / 2;
        ms(a, n, l, mid);
        ms(a, n, mid + 1, h);
        merge(a, n, l, mid, h);
    }

    static void merge(long[] a, int n, int l, int mid, int h) {
        long[] temp = new long[h - l + 1];
        int p1 = l, p2 = mid + 1, idx = 0;
        while (p1 <= mid && p2 <= h) {
            if (a[p1] <= a[p2]) {
                temp[idx++] = a[p1++];
            } else {
                temp[idx++] = a[p2++];
            }
        }
        while (p1 <= mid) {
            temp[idx++] = a[p1++];
        }
        while (p2 <= h) {
            temp[idx++] = a[p2++];
        }
        for (int i = 0; i < h - l + 1; i++) {
            a[l + i] = temp[i];
        }
    }

    static long ceil(long[] a, int n, int q) {
        ans = Integer.MAX_VALUE;
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] == q)
                return a[mid];
            else if (a[mid] > q) {
                ans = a[mid];
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
