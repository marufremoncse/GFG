package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        int diff = 0;
        int l = arr.size();
        for(int i=0;i<=l-m;i++){
            diff = arr.get(i+m-1) - arr.get(i);
            min = Math.min(diff, min);
        }

        return min;
    }
}
