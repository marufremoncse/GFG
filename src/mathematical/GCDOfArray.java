package mathematical;

public class GCDOfArray {
    public static int gcd(int a, int b) {
        // code here
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
    public int gcd(int N , int arr[])
    {
        //code here.
        int gcd = arr[0];

        for(int i=1;i<N;i++){
            gcd = gcd(gcd, arr[i]);
        }

        return gcd;
    }
}
