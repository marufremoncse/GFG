package mathematical;

public class GCDofTwoNumbers {
    public static int gcd(int a, int b) {
        // code here
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
}
