package hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstElementToOccurKTimes {
    public int firstElementKTime(int[] arr, int k) {
        int res = -1;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int e: arr){
            int val = hm.getOrDefault(e, 0) + 1;
            if(val==k){
                res = e;
                break;
            }
            hm.put(e, val);
        }
        return res;
    }
}
