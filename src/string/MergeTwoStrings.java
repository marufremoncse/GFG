package string;

public class MergeTwoStrings {
    String merge(String S1, String S2)
    {
        // code here
        int l1 = S1.length();
        int l2 = S2.length();

        int i = 0, j = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        while(i<l1 && j<l2){
            if(count%2==0){
                sb.append(Character.toString(S1.charAt(i)));
                i++;
            } else{
                sb.append(Character.toString(S2.charAt(j)));
                j++;
            }
            count++;
        }

        while(i<l1){
            sb.append(Character.toString(S1.charAt(i)));
            i++;
        }

        while(j<l2){
            sb.append(Character.toString(S2.charAt(j)));
            j++;
        }

        return sb.toString();
    }
}
