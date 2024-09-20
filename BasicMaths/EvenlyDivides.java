package BasicMaths;

import java.util.*;

public class EvenlyDivides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(evenlydivides(n));
        sc.close();
    }

    public static int evenlydivides(int n) {
        int num = n;
        int count = 0;
        while (n != 0) {
            int l = n % 10;
            if (l != 0 && num % l == 0)
                count++;
            n /= 10;
        }
        return count;
    }
}