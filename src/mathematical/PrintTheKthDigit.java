package mathematical;

public class PrintTheKthDigit {
    public static long kthDigit(int A,int B,int K){
        // code here
        long num = (long)Math.pow(A, B);

        int res = 0;
        while(--K!=0){
            num/=10;
        }
        return num%10;
    }
}
