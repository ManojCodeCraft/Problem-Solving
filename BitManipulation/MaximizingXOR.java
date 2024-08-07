package BitManipulation;
//Problem Statement:https://www.hackerrank.com/challenges/maximizing-xor/problem?isFullScreen=true
//code below:
class Result{
    public static int maximizingXor(int l, int r) {
    // Write your code here
    int maxXor = 0;
    for (int i = l; i <= r; i++) {
        for (int j = i; j <= r; j++) {
            int xor = i ^ j;
            if (xor > maxXor) {
                maxXor = xor;
            }
        }
    }
    return maxXor;
    }
}
//Time Complexity: