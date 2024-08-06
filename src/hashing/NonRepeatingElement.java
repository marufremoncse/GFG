package hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingElement {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value==1){
                return key;
            }
        }
        return 0;
    }
}
