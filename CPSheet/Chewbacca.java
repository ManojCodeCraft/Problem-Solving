package CPSheet;

import java.util.*;

public class Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String n = sc.nextLine();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int d = ch - '0';
            int invrt = 9 - d;
            if (i == 0 && d == 9)
                result.append(d);
            else
                result.append(Math.min(d, invrt));
        }
        System.out.println(result.toString());
        sc.close();
    }
}
