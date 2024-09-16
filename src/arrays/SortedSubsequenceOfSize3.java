package arrays;

import java.util.ArrayList;
import java.util.List;

public class SortedSubsequenceOfSize3 {
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        int[] min = new int[n];
        int[] max = new int[n];

        min[0] = arr[0];
        max[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            min[i] = Math.min(min[i-1], arr[i]);
        }

        for(int i=n-2;i>=0;i--){
            max[i] = Math.max(max[i+1], arr[i]);
        }

        for(int i=1;i<n-1;i++){
            if(min[i]<arr[i] && max[i]>arr[i]){
                return List.of(min[i],arr[i],max[i]);
            }
        }

        return new ArrayList<Integer>();
    }
}
