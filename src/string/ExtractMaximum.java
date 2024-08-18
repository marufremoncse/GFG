package string;

public class ExtractMaximum {
    static int extractMaximum(String S)
    {
        // code here
        String temp = "";
        int max = -1;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i)>='0' && S.charAt(i)<='9'){
                temp+=S.charAt(i);
            }
            else{
                if(temp!=""){
                    int num = Integer.parseInt(temp);
                    max = Math.max(max, num);
                }
                temp = "";
            }
        }

        if(temp!=""){
            int num = Integer.parseInt(temp);
            max = Math.max(max, num);
        }

        return max;
    }
}
