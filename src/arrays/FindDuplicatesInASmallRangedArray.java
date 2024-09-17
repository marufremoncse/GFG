package arrays;

import java.util.ArrayList;

public class FindDuplicatesInASmallRangedArray {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int n = arr.length;
        int count[] = new int[n];
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        for(int i=0;i<n;i++){
            if(count[i]>1){
                res.add(i);
            }
        }

        if(res.size()==0)
            res.add(-1);
        return res;
    }
}
