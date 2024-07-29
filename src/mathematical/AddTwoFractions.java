package mathematical;

public class AddTwoFractions {
    public int gcd(int a, int b) {
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }

    public int lcm(int a, int b) {

        return (a*b)/gcd(a, b);
    }

    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here
        int fy = lcm(den1, den2);
        int fx = (fy/den1)*num1 + (fy/den2)*num2;

        int fr = gcd(fx, fy);
        int numx = fx/fr;
        int denx = fy/fr;

        System.out.println(numx+"/"+denx);
    }
}
