package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctPairsWithDifferencek {
    public int TotalPairs(int[] nums, int k) {
        int res = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        Arrays.stream(nums).forEach(e->hm.put(e, hm.getOrDefault(e,0)+1));

        if(k==0){
            for(int num:hm.values()){
                if(num>=2){
                    res++;
                }
            }
        } else{
            for(int key:hm.keySet()){
                if(hm.containsKey(key+k)){
                    res++;
                }
            }
        }
        return res;
    }
}
