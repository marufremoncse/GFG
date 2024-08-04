package hashing;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetofAnotherArray {
    public String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> map1 = new HashMap<>();
        HashMap<Long, Integer> map2 = new HashMap<>();

        for (long i = 0; i < n; i++) {
            map1.put(a1[(int)i], map1.getOrDefault(a1[(int)i], 0)+1);
        }

        for (long i = 0; i < m; i++) {
            map2.put(a2[(int)i], map2.getOrDefault(a2[(int)i], 0)+1);
        }

        for(Map.Entry<Long, Integer> entry:map2.entrySet()){
            long key = entry.getKey();
            int value = entry.getValue();

            if(map1.containsKey(key)){
                if(value>map1.get(key)){
                    return "No";
                }
            } else{
                return "No";
            }
        }

        return "Yes";
    }
}
