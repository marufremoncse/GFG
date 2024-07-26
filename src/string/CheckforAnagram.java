package string;

public class CheckforAnagram {
    public static boolean isAnagram(String a,String b)
    {

        // Your code here
        int[] ara1 = new int[26];
        int[] ara2 = new int[26];

        for(char c:a.toCharArray()){
            ara1[c-97]++;
        }

        for(char c:b.toCharArray()){
            ara2[c-97]++;
        }

        for(int i=0;i<26;i++){
            if(ara1[i]!=ara2[i]){
                return false;
            }
        }

        return true;
    }
}
