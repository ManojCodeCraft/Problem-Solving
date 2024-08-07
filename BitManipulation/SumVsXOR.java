package BitManipulation;
//problem Statement:https://www.hackerrank.com/challenges/sum-vs-xor/problem?isFullScreen=true
//code below:
class Result {
    public static long sumXor(long n) {
    long count = 1;
    while(n>0){
        if(n%2 == 0) count*=2;
        n = n>>1;
    } 
    return count;
}
}
//Time Complexity: