package mathematical;

public class ComputeNPR {
    static long factorial(long n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    static long nPr(long n, long r){
        // code here
        return factorial(n)/factorial(n-r);
    }
}
