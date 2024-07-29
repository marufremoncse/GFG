package mathematical;

public class SumofDigitsofaNumber {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;

        while(n!=0){
            sum+= n%10;
            n/=10;
        }

        String st = Integer.toString(sum);

        int l = st.length();

        for(int i=0;i<l/2;i++){
            if(st.charAt(i)!=st.charAt(l-1-i)){
                return 0;
            }
        }
        return 1;
    }
}
