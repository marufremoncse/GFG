package mathematical;

public class LargestPrimeFactor {
    static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    // static long largestPrimeFactor(int N)
    static long largestPrimeFactor(int N) {
        for(int i=(int)Math.sqrt(N);i>=2;i--){
            if(N%i==0){
                if(isPrime(N/i)) return N/i;
                if(isPrime(i)) return i;
            }
        }
        return N;
    }
}
