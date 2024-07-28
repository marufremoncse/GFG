package string;

public class SorttheString {
    String ReverseSort(String str)
    {
        // code here
        int[] ara = new int[26];
        StringBuilder sb = new StringBuilder();
        for(char c:str.toCharArray()){
            ara[c-97]++;
        }

        for(int i=25;i>=0;i--){
            int count = ara[i];
            while(count!=0){
                sb.append(Character.toString(i+97));
                count--;
            }
        }

        return sb.toString();
    }
}
