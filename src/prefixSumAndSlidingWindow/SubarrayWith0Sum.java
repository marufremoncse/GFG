package prefixSumAndSlidingWindow;

import java.util.HashSet;

public class SubarrayWith0Sum {
    static boolean findsum(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        hs.add(sum);
        int n = arr.length;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
}
