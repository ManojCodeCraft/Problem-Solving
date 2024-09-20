package BitManipulation;

import java.util.*;

class Lonelyinteger {
    public static int lonelyinteger(List<Integer> a) {
        int result = 0;
        for (int i : a) {
            result = result ^ i;
        }
        return result;
    }
}
