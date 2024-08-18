package string;

public class ImplementStrstr {
    int strstr(String s, String x)
    {
        // Your code here
        int ls = s.length();
        int lx = x.length();
        int index = -1;
        for(int i=0;i<ls-lx+1;i++){
            int  p  = i;
            boolean res = true;
            for(char c: x.toCharArray()){
                if(c!=s.charAt(p)){
                    res = false;
                    continue;
                }
                p++;
            }
            if(res){
                index = i;
                break;
            }
        }

        return index;
    }
}
