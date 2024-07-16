package mathematical;

public class BinaryNumberToDecimalNumber {
    public int binary_to_decimal(String str) {
        // Code here
        int len = str.length();
        int res = 0;

        for(int i=len-1;i>=0;i--){
            int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            res += digit==1 ? (int)Math.pow(2, len-i-1) : 0;
        }

        return res;
    }
}
