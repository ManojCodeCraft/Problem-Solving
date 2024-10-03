package Recursion;

import java.util.Scanner;

public class Print_Name_NTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }

    public static void print(int N) {
        if (N == 0)
            return;
        System.out.print("GFG ");
        print(N - 1);

    }
}
