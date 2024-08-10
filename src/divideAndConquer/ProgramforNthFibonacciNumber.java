package divideAndConquer;

public class ProgramforNthFibonacciNumber {
    static int[] dp = new int[1001];
    static int fib(int N){
        //code here
        if(N<=1){
            return N;
        }

        if(dp[N]!=0){
            return dp[N]%10;
        }
        dp[N] = fib(N-1) + fib(N-2);

        return dp[N]%10;
    }
}
