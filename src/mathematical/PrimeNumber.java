package mathematical;

public class PrimeNumber {
    static int isPrime(int N){
        // code here
        if(N<2){
            return 0;
        }

        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return 0;
            }
        }

        return 1;
    }
}
