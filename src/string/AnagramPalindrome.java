package string;

public class AnagramPalindrome {
    int isPossible (String S)
    {
        // your code here
        int countOdd = 0;
        int[] ara = new int[26];

        for(char c:S.toCharArray()){
            ara[c-97]++;
        }

        for(int i=0;i<26;i++){
            if(ara[i]%2==1){
                countOdd++;
                if(countOdd>=2){
                    return 0;
                }
            }
        }

        return 1;
    }
}
