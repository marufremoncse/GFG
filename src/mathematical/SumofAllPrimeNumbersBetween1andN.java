package mathematical;

public class SumofAllPrimeNumbersBetween1andN {
    public long prime_Sum(int n)
    {
        // code here
        int[] ara = new int[n+1];

        for(int i=2;i*i<=n;i++){
            for(int j=i*2;j<=n;j+=i){
                ara[j] = 1;
            }
        }

        long res = 0;

        for(int j=2;j<=n;j++){
            res+=(ara[j]==0)?j:0;
        }

        return res;
    }
}
