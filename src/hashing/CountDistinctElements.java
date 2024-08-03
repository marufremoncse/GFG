package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountDistinctElements {
    static int distinct(int M[][], int N)
    {
        // code here
        Map<Integer,Integer> hm1 = new HashMap<>();

        for(int j=0;j<N;j++){
            hm1.put(M[0][j], hm1.getOrDefault(M[0][j], 0) + 1);
        }

        for(int i=1;i<N;i++){
            Map<Integer,Integer> hm2 = new HashMap<>();
            for(int j=0;j<N;j++){
                hm2.put(M[i][j], hm2.getOrDefault(M[i][j], 0) + 1);
            }

            Iterator<Map.Entry<Integer, Integer>> iterator = hm1.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                if (!hm2.containsKey(entry.getKey())) { // Condition to delete entries with values less than 3
                    iterator.remove();
                }
            }
            hm2.clear();
        }

        return hm1.size();
    }
}
