package BitManipulation;
//problem statement:https://www.hackerrank.com/challenges/flipping-bits/problem?isFullScreen=true
//code below:
class Result {
    public static long flippingBits(long n) {
    long one =(long) Math.pow(2,32)-1;
     return (n^one);  
    }
}
//time Complexity:
