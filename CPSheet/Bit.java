package CPSheet;

import java.util.Scanner;

public class Bit {
    public static int x = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String str = sc.next();
            x = ans(str);
        }
        System.out.println(x);
        sc.close();
    }

    public static int ans(String key) {
        switch (key) {
            case "++X":
                ++x;
                break;
            case "X++":
                x++;
                break;
            case "--X":
                --x;
                break;
            case "X--":
                x--;
                break;
        }
        return x;
    }
}