package dynamicProgramming;

public class PrintFirstNFibonacciNumbers {
    public static long[] printFibb(int n)
    {
        //Your code here
        long ara[] = new long[n];
        ara[0] = 1;
        if(n>1){
            ara[1] = 1;

            for(int i=2;i<n;i++){
                ara[i] = ara[i-1] + ara[i-2];
            }
        }


        return ara;
    }
}
