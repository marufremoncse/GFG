package prefixSumAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class IndexesOfSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int sum = 0, j = 0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            while(sum>=target){
                if(target==sum){
                    return new ArrayList<>(List.of(j+1, i+1));
                }
                sum-=arr[j++];
            }
        }

        return new ArrayList<>(List.of(-1));
    }
}
