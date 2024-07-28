package string;

public class TitleCaseConversion {
    public String transform(String s)
    {
        // code here
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i==0 || s.charAt(i-1)==' '){
                if(Character.isLowerCase(c)){
                    sb.append(Character.toUpperCase(c));
                } else{
                    sb.append(c);
                }
            }
            else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
