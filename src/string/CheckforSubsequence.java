package string;

public class CheckforSubsequence {
    boolean isSubSequence(String A, String B){
        int l = A.length();
        int i = 0;

        for(char c: B.toCharArray()){
            if(c==A.charAt(i)){
                i++;

                if(i==l){
                    break;
                }
            }
        }

        return i==l;
    }
}
