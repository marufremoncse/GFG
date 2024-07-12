package mathematical;

public class FactorialOfANumber {
    static long factorial(int N){
        // code here
        if(N<=1){
            return 1;
        }
        return N*factorial(N-1);
    }
}
