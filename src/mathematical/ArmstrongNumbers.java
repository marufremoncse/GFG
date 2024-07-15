package mathematical;

public class ArmstrongNumbers {
    static String armstrongNumber(int n) {
        // code here
        int temp = n;
        int res = 0;

        while(temp!=0){
            res += (int)Math.pow(temp%10, 3);
            temp/=10;
        }

        return n == res ? "true" : "false";
    }
}
