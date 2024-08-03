package misc;

public class ImplementAtoi {
    public int atoi(String s) {
        int isNegative = 1;
        if(s.charAt(0)=='-'){
            isNegative = -1;
            s = s.substring(1);
        }

        int l = s.length();

        int res = 0;
        int i = 0;
        while(i!=l){
            char c = s.charAt(i);
            if(c<'0' || c>'9'){
                return -1;
            }

            res = res*10 + (c-'0');
            i++;
        }

        return isNegative * res;
    }
}
