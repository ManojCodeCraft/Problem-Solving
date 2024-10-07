package Hashing;

import java.util.Scanner;

public class CharacterHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // precompute
        int[] hash = new int[255];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)] += 1;
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            char x = sc.next().charAt(0);
            // fetch
            System.out.println(hash[x]);
        }
        sc.close();
    }
}
