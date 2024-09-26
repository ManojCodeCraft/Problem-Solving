import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        System.out.println(canWinNim(n));
        sc.close();
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
