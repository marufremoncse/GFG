package mathematical;

public class LCMOfTwoNumbers {
    public static Long gcd(Long a, Long b) {
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        Long GCD = gcd(A,B);
        Long LCM = (A*B)/GCD;
        Long[] res = { LCM,GCD};
        return res;
    }
}
