package hashing;

import java.util.HashSet;

public class CheckforaPairwithGivenSum {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            hs.add(num);
        }

        for(int num:hs){
            int num2 = x - num;

            if(num2==num){
                return false;
            }

            if(hs.contains(num2)){
                return true;
            }
        }

        return false;
    }
}
