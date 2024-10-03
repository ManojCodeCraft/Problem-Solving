package Recursion;

import java.util.*;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }

    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(n + " ");
    }

    // print n to 1
    void printNos(int N) {
        // code here
        if (N == 0)
            return;

        System.out.print(N + " ");
        printNos(N - 1);
    }
}