package BitManipulation;

public class NumberOfSetBits {
    public int numSetBits(long a) {
        int count = 0;
        while (a != 0) {
            a &= a - 1;
            count++;
        }
        return count;
    }
}
