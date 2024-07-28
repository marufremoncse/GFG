package string;

public class ReverseWordsinaGivenString {
    String reverseWords(String S)
    {
        // code here
        String[] ara = S.split("\\.");
        int l = ara.length;
        StringBuilder sb = new StringBuilder("");
        for(int i = l-1;i >= 1;i--){
            sb.append(ara[i] +".");
        }
        sb.append(ara[0]);

        return sb.toString();
    }
}
